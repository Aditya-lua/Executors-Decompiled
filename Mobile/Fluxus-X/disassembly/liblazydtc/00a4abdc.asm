; gf_sub @ 00a4abdc
00a4abdc	ldr x9,[x1]
00a4abe0	ldr x10,[x2]
00a4abe4	orr x8,xzr,#0x1fffffffffffffe
00a4abe8	orr x14,xzr,#0x1fffffffffffffc
00a4abec	add x9,x9,x8
00a4abf0	sub x9,x9,x10
00a4abf4	str x9,[x0]
00a4abf8	ldr x10,[x1, #0x8]
00a4abfc	ldr x11,[x2, #0x8]
00a4ac00	add x10,x10,x8
00a4ac04	sub x10,x10,x11
00a4ac08	str x10,[x0, #0x8]
00a4ac0c	ldr x11,[x1, #0x10]
00a4ac10	ldr x12,[x2, #0x10]
00a4ac14	and x15,x10,#0xffffffffffffff
00a4ac18	add x15,x15,x9, LSR #0x38
00a4ac1c	add x11,x11,x8
00a4ac20	sub x11,x11,x12
00a4ac24	str x11,[x0, #0x10]
00a4ac28	ldr x12,[x1, #0x18]
00a4ac2c	ldr x13,[x2, #0x18]
00a4ac30	and x17,x11,#0xffffffffffffff
00a4ac34	add x10,x17,x10, LSR #0x38
00a4ac38	add x12,x12,x8
00a4ac3c	sub x12,x12,x13
00a4ac40	str x12,[x0, #0x18]
00a4ac44	ldr x13,[x1, #0x20]
00a4ac48	ldr x16,[x2, #0x20]
00a4ac4c	and x17,x12,#0xffffffffffffff
00a4ac50	add x11,x17,x11, LSR #0x38
00a4ac54	add x13,x13,x14
00a4ac58	sub x13,x13,x16
00a4ac5c	str x13,[x0, #0x20]
00a4ac60	ldr x14,[x1, #0x28]
00a4ac64	ldr x16,[x2, #0x28]
00a4ac68	and x9,x9,#0xffffffffffffff
00a4ac6c	add x14,x14,x8
00a4ac70	sub x14,x14,x16
00a4ac74	str x14,[x0, #0x28]
00a4ac78	ldr x16,[x1, #0x30]
00a4ac7c	ldr x17,[x2, #0x30]
00a4ac80	add x16,x16,x8
00a4ac84	sub x16,x16,x17
00a4ac88	str x16,[x0, #0x30]
00a4ac8c	ldr x18,[x1, #0x38]
00a4ac90	ldr x1,[x2, #0x38]
00a4ac94	and x17,x11,#0xffffffffffffff
00a4ac98	add x17,x17,x10, LSR #0x38
00a4ac9c	and x10,x10,#0xffffffffffffff
00a4aca0	add x8,x18,x8
00a4aca4	add x10,x10,x15, LSR #0x38
00a4aca8	sub x8,x8,x1
00a4acac	stp x10,x17,[x0, #0x10]
00a4acb0	and x10,x16,#0xffffffffffffff
00a4acb4	lsr x18,x8,#0x38
00a4acb8	add x10,x10,x14, LSR #0x38
00a4acbc	and x14,x14,#0xffffffffffffff
00a4acc0	and x8,x8,#0xffffffffffffff
00a4acc4	add x13,x18,x13
00a4acc8	add x8,x8,x16, LSR #0x38
00a4accc	add x14,x14,x13, LSR #0x38
00a4acd0	and x13,x13,#0xffffffffffffff
00a4acd4	and x17,x10,#0xffffffffffffff
00a4acd8	lsr x16,x8,#0x38
00a4acdc	and x8,x8,#0xffffffffffffff
00a4ace0	add x12,x13,x12, LSR #0x38
00a4ace4	and x15,x15,#0xffffffffffffff
00a4ace8	add x9,x18,x9
00a4acec	add x8,x8,x10, LSR #0x38
00a4acf0	add x10,x17,x14, LSR #0x38
00a4acf4	add x12,x12,x16
00a4acf8	add x15,x15,x9, LSR #0x38
00a4acfc	and x9,x9,#0xffffffffffffff
00a4ad00	and x13,x14,#0xffffffffffffff
00a4ad04	stp x10,x8,[x0, #0x30]
00a4ad08	and x10,x12,#0xffffffffffffff
00a4ad0c	add x9,x9,x16
00a4ad10	add x8,x13,x12, LSR #0x38
00a4ad14	add x10,x10,x11, LSR #0x38
00a4ad18	stp x10,x8,[x0, #0x20]
00a4ad1c	stp x9,x15,[x0]
00a4ad20	ret
