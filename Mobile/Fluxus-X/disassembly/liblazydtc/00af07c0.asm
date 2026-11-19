; WHIRLPOOL @ 00af07c0
00af07c0	sub sp,sp,#0x110
00af07c4	adrp x8,0xd22000
00af07c8	add x8,x8,#0x791
00af07cc	cmp x2,#0x0
00af07d0	stp x22,x21,[sp, #0xe0]
00af07d4	stp x20,x19,[sp, #0xf0]
00af07d8	mov x21,x1
00af07dc	mov x20,x0
00af07e0	csel x19,x8,x2,eq
00af07e4	add x0,sp,#0x8
00af07e8	mov w2,#0xa8
00af07ec	mov w1,wzr
00af07f0	str x28,[sp, #0xb0]
00af07f4	stp x26,x25,[sp, #0xc0]
00af07f8	stp x24,x23,[sp, #0xd0]
00af07fc	stp x29,x30,[sp, #0x100]
00af0800	add x29,sp,#0x100
00af0804	bl 0x00c301c0
00af0808	lsr x8,x21,#0x3c
00af080c	cbz x8,0x00af0854
00af0810	orr x25,xzr,#-0x1000000000000000
00af0814	add x24,x21,x25
00af0818	and x23,x24,#-0x1000000000000000
00af081c	orr x26,xzr,#0x1000000000000000
00af0820	mov x22,x20
00af0824	add x0,sp,#0x8
00af0828	orr x2,xzr,#-0x8000000000000000
00af082c	mov x1,x22
00af0830	bl 0x00af0280
00af0834	add x21,x21,x25
00af0838	lsr x8,x21,#0x3c
00af083c	add x22,x22,x26
00af0840	cbnz x8,0x00af0824
00af0844	add x8,x20,x23
00af0848	orr x9,xzr,#0x1000000000000000
00af084c	sub x21,x24,x23
00af0850	add x20,x8,x9
00af0854	cbz x21,0x00af0868
00af0858	lsl x2,x21,#0x3
00af085c	add x0,sp,#0x8
00af0860	mov x1,x20
00af0864	bl 0x00af0280
00af0868	add x1,sp,#0x8
00af086c	mov x0,x19
00af0870	bl 0x00af05c0
00af0874	mov x0,x19
00af0878	ldp x29,x30,[sp, #0x100]
00af087c	ldp x20,x19,[sp, #0xf0]
00af0880	ldp x22,x21,[sp, #0xe0]
00af0884	ldp x24,x23,[sp, #0xd0]
00af0888	ldp x26,x25,[sp, #0xc0]
00af088c	ldr x28,[sp, #0xb0]
00af0890	add sp,sp,#0x110
00af0894	ret
