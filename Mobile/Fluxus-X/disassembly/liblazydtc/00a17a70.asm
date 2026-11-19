; DHparams_dup @ 00a17a70
00a17a70	str x21,[sp, #-0x30]!
00a17a74	stp x20,x19,[sp, #0x10]
00a17a78	stp x29,x30,[sp, #0x20]
00a17a7c	add x29,sp,#0x20
00a17a80	mov x20,x0
00a17a84	bl 0x00c39b20
00a17a88	mov x19,x0
00a17a8c	cbz x0,0x00a17acc
00a17a90	ldr x21,[x20, #0x10]
00a17a94	add x1,x20,#0x8
00a17a98	add x0,x19,#0x8
00a17a9c	bl 0x00c39c80
00a17aa0	cbz w0,0x00a17ac0
00a17aa4	cbnz x21,0x00a17ab0
00a17aa8	ldr w8,[x20, #0x68]
00a17aac	str w8,[x19, #0x68]
00a17ab0	ldr x8,[x19, #0xc8]
00a17ab4	add x8,x8,#0x1
00a17ab8	str x8,[x19, #0xc8]
00a17abc	b 0x00a17acc
00a17ac0	mov x0,x19
00a17ac4	bl 0x00c39ab0
00a17ac8	mov x19,xzr
00a17acc	mov x0,x19
00a17ad0	ldp x29,x30,[sp, #0x20]
00a17ad4	ldp x20,x19,[sp, #0x10]
00a17ad8	ldr x21,[sp], #0x30
00a17adc	ret
