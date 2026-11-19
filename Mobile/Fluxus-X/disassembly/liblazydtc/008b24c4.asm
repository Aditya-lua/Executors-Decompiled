; FUN_008b24c4 @ 008b24c4
008b24c4	stp x29,x30,[sp, #-0x40]!
008b24c8	stp x24,x23,[sp, #0x10]
008b24cc	stp x22,x21,[sp, #0x20]
008b24d0	stp x20,x19,[sp, #0x30]
008b24d4	mov x29,sp
008b24d8	mov x21,x2
008b24dc	mov x19,x1
008b24e0	mov w1,wzr
008b24e4	mov w2,#0x1
008b24e8	mov x20,x0
008b24ec	mov w23,#0x1
008b24f0	bl 0x008bae54
008b24f4	str x0,[x19, #0x48]
008b24f8	mov x0,x20
008b24fc	mov w1,wzr
008b2500	mov x2,x21
008b2504	bl 0x008b4e40
008b2508	nop
008b250c	adr x8,0x8b2c78
008b2510	mov x22,x0
008b2514	str x8,[x0, #0x28]
008b2518	adrp x1,0x2db000
008b251c	add x1,x1,#0x5a
008b2520	mov x0,x20
008b2524	mov w2,#0x14
008b2528	bl 0x008b9ff8
008b252c	stp x0,xzr,[x22, #0x18]
008b2530	mov x0,x20
008b2534	ldr x8,[x20, #0x60]
008b2538	ldr x1,[x19, #0x48]
008b253c	ldr x2,[x8, #0x358]
008b2540	bl 0x008bce4c
008b2544	str x22,[x0]
008b2548	mov w24,#0x7
008b254c	mov w1,#0x1
008b2550	ldr x8,[x19, #0x48]
008b2554	str w24,[x0, #0xc]
008b2558	mov x0,x20
008b255c	mov x2,x21
008b2560	strb w23,[x8, #0x7]
008b2564	bl 0x008b4e40
008b2568	nop
008b256c	adr x8,0x8b2e4c
008b2570	mov x21,x0
008b2574	str x8,[x0, #0x28]
008b2578	adrp x1,0x2b9000
008b257c	add x1,x1,#0x1e
008b2580	mov x0,x20
008b2584	mov w2,#0x18
008b2588	bl 0x008b9ff8
008b258c	mov w8,#0xb
008b2590	stp x0,xzr,[x21, #0x18]
008b2594	adrp x1,0x2c0000
008b2598	add x1,x1,#0xe42
008b259c	mov x0,x20
008b25a0	mov w2,#0x6
008b25a4	str x19,[x21, #0x30]
008b25a8	str w8,[x21, #0x3c]
008b25ac	bl 0x008b9ff8
008b25b0	ldr x8,[x19, #0x38]
008b25b4	mov x1,x0
008b25b8	mov x0,x8
008b25bc	bl 0x008bb440
008b25c0	ldr d0,[x0]
008b25c4	ldr w9,[x19, #0x58]
008b25c8	ldr x10,[x19, #0x28]
008b25cc	fcvtzu w8,d0
008b25d0	sub w8,w8,w9
008b25d4	add x8,x10,w8, UXTW  #0x4
008b25d8	str x21,[x8]
008b25dc	str w24,[x8, #0xc]
008b25e0	ldp x20,x19,[sp, #0x30]
008b25e4	ldp x22,x21,[sp, #0x20]
008b25e8	ldp x24,x23,[sp, #0x10]
008b25ec	ldp x29,x30,[sp], #0x40
008b25f0	ret
