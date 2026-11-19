; FUN_009ba870 @ 009ba870
009ba870	stp x22,x21,[sp, #-0x30]!
009ba874	stp x20,x19,[sp, #0x10]
009ba878	stp x29,x30,[sp, #0x20]
009ba87c	mov x21,x0
009ba880	ldr x0,[x0, #0x18]
009ba884	mov x20,x1
009ba888	add x29,sp,#0x20
009ba88c	cbz x0,0x009ba944
009ba890	mov x1,x20
009ba894	bl 0x00c32850
009ba898	ldr x8,[x21, #0x18]
009ba89c	mov w19,w0
009ba8a0	ldr x8,[x8, #0x158]
009ba8a4	mov x9,x8
009ba8a8	ldr x0,[x21, #0x20]
009ba8ac	cbz x0,0x009ba8c8
009ba8b0	mov x1,x20
009ba8b4	bl 0x00c35f50
009ba8b8	ldr x8,[x21, #0x20]
009ba8bc	mov w19,w0
009ba8c0	ldr x8,[x8, #0x898]
009ba8c4	mov x9,x8
009ba8c8	cbz x9,0x009ba92c
009ba8cc	cmp w19,#0x1
009ba8d0	b.lt 0x009ba92c
009ba8d4	ldrb w10,[x21]
009ba8d8	tbz w10,#0x6,0x009ba92c
009ba8dc	ldr x8,[x8]
009ba8e0	add x9,x9,#0x20
009ba8e4	mov w2,#0x1bb
009ba8e8	sub x8,x8,x9
009ba8ec	orr x9,xzr,#0x6666666666666666
009ba8f0	lsr x8,x8,#0x3
009ba8f4	movk x9,#0x6668
009ba8f8	madd x22,x8,x9,x21
009ba8fc	ldr x0,[x22, #0x30]
009ba900	adrp x21,0x2ad000
009ba904	add x21,x21,#0x7c2
009ba908	mov x1,x21
009ba90c	bl 0x00c32310
009ba910	mov w2,#0x1bc
009ba914	mov x0,x20
009ba918	mov x1,x21
009ba91c	bl 0x00c34600
009ba920	cmp x0,#0x0
009ba924	csel w19,wzr,w19,eq
009ba928	str x0,[x22, #0x30]
009ba92c	cmp w19,#0x0
009ba930	ldp x29,x30,[sp, #0x20]
009ba934	ldp x20,x19,[sp, #0x10]
009ba938	cset w0,gt
009ba93c	ldp x22,x21,[sp], #0x30
009ba940	ret
009ba944	mov x8,xzr
009ba948	mov x9,xzr
009ba94c	mov w19,#0x1
009ba950	ldr x0,[x21, #0x20]
009ba954	cbnz x0,0x009ba8b0
009ba958	b 0x009ba8c8
