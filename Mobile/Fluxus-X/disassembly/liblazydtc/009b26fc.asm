; SSL_set1_host @ 009b26fc
009b26fc	stp x20,x19,[sp, #-0x20]!
009b2700	mov x19,x1
009b2704	mov x20,x0
009b2708	stp x29,x30,[sp, #0x10]
009b270c	add x29,sp,#0x10
009b2710	cbz x1,0x009b2734
009b2714	ldr x0,[x20, #0x4d8]
009b2718	mov x1,x19
009b271c	bl 0x00c35bf0
009b2720	cmp w0,#0x1
009b2724	b.ne 0x009b2734
009b2728	ldp x29,x30,[sp, #0x10]
009b272c	ldp x20,x19,[sp], #0x20
009b2730	ret
009b2734	ldr x0,[x20, #0x4d8]
009b2738	ldp x29,x30,[sp, #0x10]
009b273c	mov x1,x19
009b2740	mov x2,xzr
009b2744	ldp x20,x19,[sp], #0x20
009b2748	b 0x00c340a0
