; std::__ndk1::ctype<wchar_t>::do_narrow @ 00bfca08
00bfca08	bti c
00bfca0c	cmp x1,x2
00bfca10	b.eq 0x00bfca6c
00bfca14	sub x8,x2,x1
00bfca18	sub x8,x8,#0x4
00bfca1c	cmp x8,#0x7c
00bfca20	b.cc 0x00bfca48
00bfca24	and x9,x8,#-0x4
00bfca28	add x9,x1,x9
00bfca2c	add x9,x9,#0x4
00bfca30	cmp x4,x9
00bfca34	b.cs 0x00bfca74
00bfca38	add x9,x4,x8, LSR #0x2
00bfca3c	add x9,x9,#0x1
00bfca40	cmp x1,x9
00bfca44	b.cs 0x00bfca74
00bfca48	mov x8,x4
00bfca4c	mov x0,x1
00bfca50	ldr w9,[x0], #0x4
00bfca54	cmp w9,#0x80
00bfca58	csel w9,w9,w3,cc
00bfca5c	cmp x0,x2
00bfca60	strb w9,[x8], #0x1
00bfca64	b.ne 0x00bfca50
00bfca68	ret
00bfca6c	mov x0,x1
00bfca70	ret
00bfca74	lsr x8,x8,#0x2
00bfca78	movi v0.4S,#0x80
00bfca7c	dup v1.16B,w3
00bfca80	adrp x11,0x29c000
00bfca84	add x12,x4,#0x10
00bfca88	add x9,x8,#0x1
00bfca8c	ldr q2,[x11, #0xcb0]
00bfca90	add x11,x1,#0x40
00bfca94	and x10,x9,#0x7fffffffffffffe0
00bfca98	add x0,x1,x10, LSL #0x2
00bfca9c	add x8,x4,x10
00bfcaa0	mov x13,x10
00bfcaa4	ldp q3,q4,[x11, #-0x40]
00bfcaa8	subs x13,x13,#0x20
00bfcaac	ldp q16,q17,[x11]
00bfcab0	ldp q5,q6,[x11, #-0x20]
00bfcab4	ldp q18,q19,[x11, #0x20]
00bfcab8	cmhi v21.4S,v0.4S,v4.4S
00bfcabc	cmhi v22.4S,v0.4S,v3.4S
00bfcac0	cmhi v25.4S,v0.4S,v17.4S
00bfcac4	cmhi v26.4S,v0.4S,v16.4S
00bfcac8	cmhi v7.4S,v0.4S,v6.4S
00bfcacc	cmhi v20.4S,v0.4S,v5.4S
00bfcad0	tbl v3.16B,{v3.16B,v4.16B,v5.16B,v6.16B},v2.16B
00bfcad4	cmhi v23.4S,v0.4S,v19.4S
00bfcad8	cmhi v24.4S,v0.4S,v18.4S
00bfcadc	tbl v5.16B,{v16.16B,v17.16B,v18.16B,v19.16B},v2.16B
00bfcae0	add x11,x11,#0x80
00bfcae4	uzp1 v7.8H,v20.8H,v7.8H
00bfcae8	uzp1 v20.8H,v22.8H,v21.8H
00bfcaec	uzp1 v22.8H,v26.8H,v25.8H
00bfcaf0	uzp1 v21.8H,v24.8H,v23.8H
00bfcaf4	uzp1 v7.16B,v20.16B,v7.16B
00bfcaf8	uzp1 v4.16B,v22.16B,v21.16B
00bfcafc	bif v3.16B,v1.16B,v7.16B
00bfcb00	bsl v4.16B,v5.16B,v1.16B
00bfcb04	stp q3,q4,[x12, #-0x10]
00bfcb08	add x12,x12,#0x20
00bfcb0c	b.ne 0x00bfcaa4
00bfcb10	cmp x9,x10
00bfcb14	b.ne 0x00bfca50
00bfcb18	b 0x00bfca68
