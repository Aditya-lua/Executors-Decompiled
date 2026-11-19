; FUN_00ba2854 @ 00ba2854
00ba2854	sub sp,sp,#0x70
00ba2858	str x21,[sp, #0x40]
00ba285c	stp x20,x19,[sp, #0x50]
00ba2860	stp x29,x30,[sp, #0x60]
00ba2864	add x29,sp,#0x60
00ba2868	mrs x21,tpidr_el0
00ba286c	ldr x8,[x21, #0x28]
00ba2870	mov x20,x2
00ba2874	adrp x3,0x2ab000
00ba2878	adrp x6,0x2da000
00ba287c	stur x8,[x29, #-0x28]
00ba2880	str xzr,[x2]
00ba2884	adrp x2,0x2c8000
00ba2888	mov x19,x1
00ba288c	mov x5,x0
00ba2890	lsr x4,x0,#0x20
00ba2894	add x2,x2,#0x894
00ba2898	add x3,x3,#0x32c
00ba289c	add x6,x6,#0xd07
00ba28a0	add x0,sp,#0x1c
00ba28a4	mov w1,#0x19
00ba28a8	bl 0x00c31ed0
00ba28ac	adrp x1,0x2bb000
00ba28b0	add x1,x1,#0x65
00ba28b4	add x0,sp,#0x1c
00ba28b8	bl 0x00c30c10
00ba28bc	str x0,[x20]
00ba28c0	cbz x0,0x00ba290c
00ba28c4	mov x1,xzr
00ba28c8	bl 0x00c42490
00ba28cc	ldr x3,[x20]
00ba28d0	add x0,sp,#0x8
00ba28d4	mov w1,#0x1
00ba28d8	mov w2,#0x10
00ba28dc	bl 0x00c31e60
00ba28e0	cmp x0,#0x10
00ba28e4	b.ne 0x00ba2904
00ba28e8	ldr x8,[sp, #0x8]
00ba28ec	mov x9,#0x5350
00ba28f0	movk x9,#0x41, LSL #16
00ba28f4	movk x9,#0x5449, LSL #32
00ba28f8	movk x9,#0x53, LSL #48
00ba28fc	cmp x8,x9
00ba2900	b.eq 0x00ba2914
00ba2904	mov w0,#0xffffff68
00ba2908	b 0x00ba2920
00ba290c	mov w0,#0xffffff74
00ba2910	b 0x00ba2920
00ba2914	ldr x8,[sp, #0x10]
00ba2918	mov w0,wzr
00ba291c	str x8,[x19]
00ba2920	ldr x8,[x21, #0x28]
00ba2924	ldur x9,[x29, #-0x28]
00ba2928	cmp x8,x9
00ba292c	b.ne 0x00ba2944
00ba2930	ldp x29,x30,[sp, #0x60]
00ba2934	ldp x20,x19,[sp, #0x50]
00ba2938	ldr x21,[sp, #0x40]
00ba293c	add sp,sp,#0x70
00ba2940	ret
00ba2944	bl 0x00c2fec0
