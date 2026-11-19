; FUN_008a6fe4 @ 008a6fe4
008a6fe4	ldp x8,x9,[x0, #0x18]
008a6fe8	add x10,x1,#0x1
008a6fec	mov w11,#0x1
008a6ff0	sub x9,x9,#0x1
008a6ff4	and x10,x10,x9
008a6ff8	lsr x12,x10,#0x6
008a6ffc	lsl x16,x11,x10
008a7000	add x12,x8,x12, LSL #0x3
008a7004	ldr x13,[x12]
008a7008	tst x13,x16
008a700c	b.eq 0x008a70ac
008a7010	mov x14,#0x7c15
008a7014	ldr x11,[x0]
008a7018	ldrb w13,[x0, #0x30]
008a701c	movk x14,#0x7f4a, LSL #16
008a7020	mov w15,#0x1
008a7024	movk x14,#0x79b9, LSL #32
008a7028	movk x14,#0x9e37, LSL #48
008a702c	b 0x008a7050
008a7030	add x10,x10,#0x1
008a7034	and x10,x10,x9
008a7038	lsr x12,x10,#0x6
008a703c	lsl x16,x15,x10
008a7040	add x12,x8,x12, LSL #0x3
008a7044	ldr x17,[x12]
008a7048	tst x17,x16
008a704c	b.eq 0x008a70ac
008a7050	ldr x17,[x11, x10, LSL #0x3]
008a7054	lsr x2,x17,#0x4
008a7058	eor x2,x2,x17, LSR #0x9
008a705c	mul x2,x2,x14
008a7060	lsr x2,x2,x13
008a7064	sub x3,x1,x2
008a7068	sub x2,x10,x2
008a706c	and x3,x3,x9
008a7070	and x2,x2,x9
008a7074	cmp x3,x2
008a7078	b.cs 0x008a7030
008a707c	lsr x2,x1,#0x3
008a7080	lsl x3,x15,x1
008a7084	str x17,[x11, x1, LSL #0x3]
008a7088	mov x1,x10
008a708c	and x2,x2,#0x1ffffffffffffff8
008a7090	ldr x4,[x8, x2#0x0]
008a7094	orr x3,x4,x3
008a7098	str x3,[x8, x2#0x0]
008a709c	ldr x2,[x12]
008a70a0	bic x16,x2,x16
008a70a4	str x16,[x12]
008a70a8	b 0x008a7030
008a70ac	lsr x9,x1,#0x3
008a70b0	mov w10,#0x1
008a70b4	lsl x10,x10,x1
008a70b8	and x9,x9,#0x1ffffffffffffff8
008a70bc	ldr x11,[x8, x9#0x0]
008a70c0	bic x10,x11,x10
008a70c4	str x10,[x8, x9#0x0]
008a70c8	ldr x8,[x0, #0x28]
008a70cc	sub x8,x8,#0x1
008a70d0	str x8,[x0, #0x28]
008a70d4	ret
