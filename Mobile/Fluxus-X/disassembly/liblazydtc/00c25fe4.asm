; FUN_00c25fe4 @ 00c25fe4
00c25fe4	paciasp
00c25fe8	stp x29,x30,[sp, #-0x30]!
00c25fec	stp x22,x21,[sp, #0x10]
00c25ff0	stp x20,x19,[sp, #0x20]
00c25ff4	mov x29,sp
00c25ff8	ldr x22,[x0, #0x1330]
00c25ffc	mov x19,x2
00c26000	mov x20,x1
00c26004	ldr x8,[x22, #0x8]
00c26008	sub x9,x8,#0xfd0
00c2600c	cmn x9,#0xff1
00c26010	b.hi 0x00c26034
00c26014	mov x21,x0
00c26018	mov w0,#0x1000
00c2601c	bl 0x00c308d0
00c26020	cbz x0,0x00c2609c
00c26024	mov x8,xzr
00c26028	stp x22,xzr,[x0]
00c2602c	mov x22,x0
00c26030	str x0,[x21, #0x1330]
00c26034	add x9,x8,#0x20
00c26038	add x0,x22,x8
00c2603c	ldr x8,[x20]
00c26040	str x9,[x22, #0x8]
00c26044	adrp x10,0xcb4000
00c26048	add x10,x10,#0x88
00c2604c	ldurh w12,[x8, #0x9]
00c26050	mov w9,#0xd
00c26054	ldr w11,[x19]
00c26058	str x10,[x0, #0x10]!
00c2605c	ldurh w10,[x0, #0x9]
00c26060	strb w9,[x0, #0x8]
00c26064	mov w9,#0x500
00c26068	and w12,w12,#0xc0
00c2606c	str x8,[x0, #0x10]
00c26070	and w8,w10,#0xf000
00c26074	orr w9,w12,w9
00c26078	orr w8,w9,w8
00c2607c	str w11,[x0, #0x18]
00c26080	sturh w8,[x0, #0x9]
00c26084	strb wzr,[x0, #0x1c]
00c26088	ldp x20,x19,[sp, #0x20]
00c2608c	ldp x22,x21,[sp, #0x10]
00c26090	ldp x29,x30,[sp], #0x30
00c26094	autiasp
00c26098	ret
00c2609c	bl 0x00c2fff0
