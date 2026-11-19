; FUN_00c19670 @ 00c19670
00c19670	paciasp
00c19674	stp x29,x30,[sp, #-0x30]!
00c19678	str x21,[sp, #0x10]
00c1967c	stp x20,x19,[sp, #0x20]
00c19680	mov x29,sp
00c19684	ldr x21,[x0, #0x1330]
00c19688	mov x19,x1
00c1968c	ldr x8,[x21, #0x8]
00c19690	sub x9,x8,#0xfb0
00c19694	cmn x9,#0xff1
00c19698	b.hi 0x00c196bc
00c1969c	mov x20,x0
00c196a0	mov w0,#0x1000
00c196a4	bl 0x00c308d0
00c196a8	cbz x0,0x00c19720
00c196ac	mov x8,xzr
00c196b0	stp x21,xzr,[x0]
00c196b4	mov x21,x0
00c196b8	str x0,[x20, #0x1330]
00c196bc	add x9,x8,#0x40
00c196c0	add x0,x21,x8
00c196c4	adrp x8,0xcb1000
00c196c8	add x8,x8,#0xf40
00c196cc	str x9,[x21, #0x8]
00c196d0	adrp x9,0x2b6000
00c196d4	add x9,x9,#0xbb5
00c196d8	str x8,[x0, #0x10]!
00c196dc	mov w8,#0x3c
00c196e0	mov w10,#0xa
00c196e4	strb w8,[x0, #0x8]
00c196e8	ldurh w8,[x0, #0x9]
00c196ec	stp x9,x10,[x0, #0x10]
00c196f0	mov w9,#0x540
00c196f4	ldr x10,[x19]
00c196f8	and w8,w8,#0xf000
00c196fc	stp xzr,xzr,[x0, #0x28]
00c19700	orr w8,w8,w9
00c19704	str x10,[x0, #0x20]
00c19708	sturh w8,[x0, #0x9]
00c1970c	ldp x20,x19,[sp, #0x20]
00c19710	ldr x21,[sp, #0x10]
00c19714	ldp x29,x30,[sp], #0x30
00c19718	autiasp
00c1971c	ret
00c19720	bl 0x00c2fff0
