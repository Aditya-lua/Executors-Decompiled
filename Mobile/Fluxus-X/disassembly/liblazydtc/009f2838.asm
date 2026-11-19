; d2i_PrivateKey @ 009f2838
009f2838	stp x22,x21,[sp, #-0x30]!
009f283c	mov x4,xzr
009f2840	mov x5,xzr
009f2844	stp x20,x19,[sp, #0x10]
009f2848	stp x29,x30,[sp, #0x20]
009f284c	add x29,sp,#0x20
009f2850	mov x19,x3
009f2854	mov x20,x2
009f2858	mov x21,x1
009f285c	mov w22,w0
009f2860	bl 0x009f25b4
009f2864	cbz x0,0x009f2878
009f2868	ldp x29,x30,[sp, #0x20]
009f286c	ldp x20,x19,[sp, #0x10]
009f2870	ldp x22,x21,[sp], #0x30
009f2874	ret
009f2878	mov x2,x20
009f287c	mov x3,x19
009f2880	ldp x29,x30,[sp, #0x20]
009f2884	ldp x20,x19,[sp, #0x10]
009f2888	mov w0,w22
009f288c	mov x1,x21
009f2890	mov x4,xzr
009f2894	mov x5,xzr
009f2898	ldp x22,x21,[sp], #0x30
009f289c	b 0x009f2338
