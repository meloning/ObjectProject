package com.junsu.object;

public class Bag {
  private Long amount;
  private Ticket ticket;
  private Invitation invitation;

  public Bag(Long amount) {
    this(null, amount);
  }

  public Bag(Invitation invitation, Long amount) {
    this.invitation = invitation;
    this.amount = amount;
  }

  public boolean hasInvitation() {
    return invitation != null;
  }

  public boolean hasTicket() {
    return ticket != null;
  }

  public void setTicket(Ticket ticket) {
    this.ticket = ticket;
  }

  public void minusAmount(Long amount) {
    this.amount -= amount;
  }

  public void plusAmount(Long amount) {
    this.amount += amount;
  }
}