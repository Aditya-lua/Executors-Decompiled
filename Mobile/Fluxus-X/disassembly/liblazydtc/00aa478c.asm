; FUN_00aa478c @ 00aa478c
00aa478c	cbz x0,0x00aa4890
00aa4790	stp x24,x23,[sp, #-0x40]!
00aa4794	stp x22,x21,[sp, #0x10]
00aa4798	stp x20,x19,[sp, #0x20]
00aa479c	stp x29,x30,[sp, #0x30]
00aa47a0	ldrb w8,[x0, #0x48]
00aa47a4	mov x19,x0
00aa47a8	ldr x0,[x0, #0x28]
00aa47ac	adrp x1,0x2aa000
00aa47b0	orr w8,w8,#0x2
00aa47b4	add x1,x1,#0x4b5
00aa47b8	mov w2,#0x126
00aa47bc	add x29,sp,#0x30
00aa47c0	strb w8,[x19, #0x48]
00aa47c4	bl 0x00c32310
00aa47c8	ldr x0,[x19, #0x8]
00aa47cc	adrp x1,0xaa4000
00aa47d0	add x1,x1,#0x8a8
00aa47d4	bl 0x00c32600
00aa47d8	ldr x0,[x19, #0x10]
00aa47dc	adrp x1,0xaa4000
00aa47e0	add x1,x1,#0x8ec
00aa47e4	bl 0x00c32600
00aa47e8	ldr x0,[x19, #0x18]
00aa47ec	bl 0x00c34d40
00aa47f0	ldr x0,[x19, #0x20]
00aa47f4	bl 0x00c34d40
00aa47f8	ldp x0,x8,[x19, #0x30]
00aa47fc	cbz x8,0x00aa485c
00aa4800	adrp x20,0x2aa000
00aa4804	adrp x21,0xaa2000
00aa4808	mov x22,xzr
00aa480c	mov x23,xzr
00aa4810	add x20,x20,#0x4b5
00aa4814	add x21,x21,#0x7d0
00aa4818	add x24,x0,x22
00aa481c	ldr x0,[x24]
00aa4820	mov w2,#0x119
00aa4824	mov x1,x20
00aa4828	bl 0x00c32310
00aa482c	ldr x0,[x24, #0x8]
00aa4830	mov w2,#0x11a
00aa4834	mov x1,x20
00aa4838	bl 0x00c32310
00aa483c	ldr x0,[x24, #0x18]
00aa4840	mov x1,x21
00aa4844	bl 0x00c32600
00aa4848	ldp x0,x8,[x19, #0x30]
00aa484c	add x23,x23,#0x1
00aa4850	add x22,x22,#0x28
00aa4854	cmp x23,x8
00aa4858	b.cc 0x00aa4818
00aa485c	adrp x20,0x2aa000
00aa4860	add x20,x20,#0x4b5
00aa4864	mov w2,#0x130
00aa4868	mov x1,x20
00aa486c	bl 0x00c32310
00aa4870	mov x0,x19
00aa4874	mov x1,x20
00aa4878	ldp x29,x30,[sp, #0x30]
00aa487c	ldp x20,x19,[sp, #0x20]
00aa4880	ldp x22,x21,[sp, #0x10]
00aa4884	mov w2,#0x131
00aa4888	ldp x24,x23,[sp], #0x40
00aa488c	b 0x00c32310
00aa4890	ret
