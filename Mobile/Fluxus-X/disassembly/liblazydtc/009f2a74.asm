; PKCS8_pkey_set0 @ 009f2a74
009f2a74	stp x24,x23,[sp, #-0x40]!
009f2a78	stp x22,x21,[sp, #0x10]
009f2a7c	stp x20,x19,[sp, #0x20]
009f2a80	mov w19,w6
009f2a84	mov x20,x5
009f2a88	mov x22,x4
009f2a8c	mov w23,w3
009f2a90	mov x24,x1
009f2a94	mov x21,x0
009f2a98	stp x29,x30,[sp, #0x30]
009f2a9c	add x29,sp,#0x30
009f2aa0	tbnz w2,#0x1f,0x009f2ab4
009f2aa4	ldr x0,[x21]
009f2aa8	sxtw x1,w2
009f2aac	bl 0x00c375b0
009f2ab0	cbz w0,0x009f2ae4
009f2ab4	ldr x0,[x21, #0x8]
009f2ab8	mov x1,x24
009f2abc	mov w2,w23
009f2ac0	mov x3,x22
009f2ac4	bl 0x00c37ee0
009f2ac8	cbz w0,0x009f2ae4
009f2acc	cbz x20,0x009f2ae0
009f2ad0	ldr x0,[x21, #0x10]
009f2ad4	mov x1,x20
009f2ad8	mov w2,w19
009f2adc	bl 0x00c37be0
009f2ae0	mov w0,#0x1
009f2ae4	ldp x29,x30,[sp, #0x30]
009f2ae8	ldp x20,x19,[sp, #0x20]
009f2aec	ldp x22,x21,[sp, #0x10]
009f2af0	ldp x24,x23,[sp], #0x40
009f2af4	ret
