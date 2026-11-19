; dtls_process_hello_verify @ 009de4f8
009de4f8	stp x20,x19,[sp, #-0x20]!
009de4fc	stp x29,x30,[sp, #0x10]
009de500	ldr x9,[x1, #0x8]
009de504	mov x19,x0
009de508	add x29,sp,#0x10
009de50c	cmp x9,#0x2
009de510	b.cc 0x009de538
009de514	ldr x8,[x1]
009de518	subs x10,x9,#0x2
009de51c	add x11,x8,#0x2
009de520	stp x11,x10,[x1]
009de524	b.eq 0x009de538
009de528	ldrb w20,[x8, #0x2]
009de52c	sub x9,x9,#0x3
009de530	subs x9,x9,x20
009de534	b.cs 0x009de578
009de538	bl 0x00c342a0
009de53c	adrp x0,0x2d7000
009de540	adrp x2,0x2cd000
009de544	add x0,x0,#0xb1a
009de548	add x2,x2,#0x778
009de54c	mov w1,#0x505
009de550	bl 0x00c342b0
009de554	mov w1,#0x32
009de558	mov w2,#0x9f
009de55c	mov x0,x19
009de560	mov x3,xzr
009de564	bl 0x00c34410
009de568	mov w0,wzr
009de56c	ldp x29,x30,[sp, #0x10]
009de570	ldp x20,x19,[sp], #0x20
009de574	ret
009de578	add x8,x8,#0x3
009de57c	add x10,x8,x20
009de580	stp x10,x9,[x1]
009de584	ldr x0,[x19, #0x4b8]
009de588	mov x1,x8
009de58c	mov x2,x20
009de590	bl 0x00c2ffd0
009de594	ldr x8,[x19, #0x4b8]
009de598	mov w0,#0x1
009de59c	str x20,[x8, #0x100]
009de5a0	b 0x009de56c
