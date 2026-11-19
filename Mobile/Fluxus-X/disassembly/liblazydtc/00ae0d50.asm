; SHA3_absorb @ 00ae0d50
00ae0d50	stp x24,x23,[sp, #-0x40]!
00ae0d54	stp x20,x19,[sp, #0x20]
00ae0d58	mov x19,x2
00ae0d5c	cmp x2,x3
00ae0d60	stp x22,x21,[sp, #0x10]
00ae0d64	stp x29,x30,[sp, #0x30]
00ae0d68	add x29,sp,#0x30
00ae0d6c	b.cc 0x00ae0dc4
00ae0d70	mov x20,x3
00ae0d74	mov x21,x1
00ae0d78	mov x22,x0
00ae0d7c	lsr x23,x3,#0x3
00ae0d80	and x24,x3,#-0x8
00ae0d84	cbz x23,0x00ae0db0
00ae0d88	mov x8,x22
00ae0d8c	mov x9,x23
00ae0d90	mov x10,x21
00ae0d94	ldr x11,[x10], #0x8
00ae0d98	ldr x12,[x8]
00ae0d9c	subs x9,x9,#0x1
00ae0da0	eor x11,x11,x12
00ae0da4	str x11,[x8], #0x8
00ae0da8	b.ne 0x00ae0d94
00ae0dac	add x21,x21,x24
00ae0db0	mov x0,x22
00ae0db4	bl 0x00ae0ddc
00ae0db8	sub x19,x19,x20
00ae0dbc	cmp x19,x20
00ae0dc0	b.cs 0x00ae0d84
00ae0dc4	mov x0,x19
00ae0dc8	ldp x29,x30,[sp, #0x30]
00ae0dcc	ldp x20,x19,[sp, #0x20]
00ae0dd0	ldp x22,x21,[sp, #0x10]
00ae0dd4	ldp x24,x23,[sp], #0x40
00ae0dd8	ret
