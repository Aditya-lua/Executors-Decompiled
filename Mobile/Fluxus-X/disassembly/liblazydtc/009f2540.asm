; d2i_PrivateKey_ex @ 009f2540
009f2540	stp x24,x23,[sp, #-0x40]!
009f2544	stp x22,x21,[sp, #0x10]
009f2548	stp x20,x19,[sp, #0x20]
009f254c	stp x29,x30,[sp, #0x30]
009f2550	add x29,sp,#0x30
009f2554	mov x19,x5
009f2558	mov x20,x4
009f255c	mov x21,x3
009f2560	mov x22,x2
009f2564	mov x23,x1
009f2568	mov w24,w0
009f256c	bl 0x009f25b4
009f2570	cbz x0,0x009f2588
009f2574	ldp x29,x30,[sp, #0x30]
009f2578	ldp x20,x19,[sp, #0x20]
009f257c	ldp x22,x21,[sp, #0x10]
009f2580	ldp x24,x23,[sp], #0x40
009f2584	ret
009f2588	mov x2,x22
009f258c	mov x3,x21
009f2590	mov x4,x20
009f2594	mov x5,x19
009f2598	ldp x29,x30,[sp, #0x30]
009f259c	ldp x20,x19,[sp, #0x20]
009f25a0	ldp x22,x21,[sp, #0x10]
009f25a4	mov w0,w24
009f25a8	mov x1,x23
009f25ac	ldp x24,x23,[sp], #0x40
009f25b0	b 0x009f2338
