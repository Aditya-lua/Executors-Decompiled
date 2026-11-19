; i2a_ASN1_STRING @ 00ab24a0
00ab24a0	sub sp,sp,#0x60
00ab24a4	stp x26,x25,[sp, #0x10]
00ab24a8	stp x24,x23,[sp, #0x20]
00ab24ac	stp x22,x21,[sp, #0x30]
00ab24b0	stp x20,x19,[sp, #0x40]
00ab24b4	stp x29,x30,[sp, #0x50]
00ab24b8	add x29,sp,#0x50
00ab24bc	cbz x1,0x00ab2594
00ab24c0	ldr w8,[x1]
00ab24c4	mov x21,x1
00ab24c8	mov x20,x0
00ab24cc	cbz w8,0x00ab259c
00ab24d0	cmp w8,#0x1
00ab24d4	b.lt 0x00ab2594
00ab24d8	mov w24,#0x41d5
00ab24dc	adrp x22,0x2cb000
00ab24e0	adrp x26,0x2a3000
00ab24e4	mov x23,xzr
00ab24e8	mov w19,wzr
00ab24ec	movk w24,#0xd41d, LSL #16
00ab24f0	mov w25,#0x23
00ab24f4	add x22,x22,#0xf79
00ab24f8	add x26,x26,#0x64c
00ab24fc	cbz x23,0x00ab2540
00ab2500	and x8,x23,#0xffffffff
00ab2504	mul x8,x8,x24
00ab2508	lsr x8,x8,#0x20
00ab250c	sub w9,w23,w8
00ab2510	add w8,w8,w9, LSR #0x1
00ab2514	lsr w8,w8,#0x5
00ab2518	mul w8,w8,w25
00ab251c	cmp w8,w23
00ab2520	b.ne 0x00ab2540
00ab2524	mov w2,#0x2
00ab2528	mov x0,x20
00ab252c	mov x1,x22
00ab2530	bl 0x00c34240
00ab2534	cmp w0,#0x2
00ab2538	b.ne 0x00ab25bc
00ab253c	add w19,w19,#0x2
00ab2540	ldr x8,[x21, #0x8]
00ab2544	add x1,sp,#0xc
00ab2548	mov w2,#0x2
00ab254c	mov x0,x20
00ab2550	ldrb w9,[x8, x23]
00ab2554	lsr w9,w9,#0x4
00ab2558	ldrb w9,[x26, w9, UXTW ]
00ab255c	strb w9,[sp, #0xc]
00ab2560	ldrb w8,[x8, x23]
00ab2564	and x8,x8,#0xf
00ab2568	ldrb w8,[x26, x8]
00ab256c	strb w8,[sp, #0xd]
00ab2570	bl 0x00c34240
00ab2574	cmp w0,#0x2
00ab2578	b.ne 0x00ab25bc
00ab257c	ldrsw x8,[x21]
00ab2580	add x23,x23,#0x1
00ab2584	add w19,w19,#0x2
00ab2588	cmp x23,x8
00ab258c	b.lt 0x00ab24fc
00ab2590	b 0x00ab25c0
00ab2594	mov w19,wzr
00ab2598	b 0x00ab25c0
00ab259c	adrp x1,0x2cb000
00ab25a0	add x1,x1,#0x723
00ab25a4	mov w2,#0x1
00ab25a8	mov x0,x20
00ab25ac	mov w19,#0x1
00ab25b0	bl 0x00c34240
00ab25b4	cmp w0,#0x1
00ab25b8	b.eq 0x00ab25c0
00ab25bc	mov w19,#0xffffffff
00ab25c0	mov w0,w19
00ab25c4	ldp x29,x30,[sp, #0x50]
00ab25c8	ldp x20,x19,[sp, #0x40]
00ab25cc	ldp x22,x21,[sp, #0x30]
00ab25d0	ldp x24,x23,[sp, #0x20]
00ab25d4	ldp x26,x25,[sp, #0x10]
00ab25d8	add sp,sp,#0x60
00ab25dc	ret
