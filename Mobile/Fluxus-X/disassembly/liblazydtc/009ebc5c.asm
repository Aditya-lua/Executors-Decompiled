; dtls_raw_hello_verify_request @ 009ebc5c
009ebc5c	str x21,[sp, #-0x30]!
009ebc60	stp x20,x19,[sp, #0x10]
009ebc64	mov x19,x2
009ebc68	mov x20,x1
009ebc6c	mov w1,#0xfeff
009ebc70	mov w2,#0x2
009ebc74	stp x29,x30,[sp, #0x20]
009ebc78	add x29,sp,#0x20
009ebc7c	mov x21,x0
009ebc80	bl 0x00c343a0
009ebc84	cbz w0,0x009ebca4
009ebc88	mov w3,#0x1
009ebc8c	mov x0,x21
009ebc90	mov x1,x20
009ebc94	mov x2,x19
009ebc98	bl 0x00c36f70
009ebc9c	cmp w0,#0x0
009ebca0	cset w0,ne
009ebca4	ldp x29,x30,[sp, #0x20]
009ebca8	ldp x20,x19,[sp, #0x10]
009ebcac	ldr x21,[sp], #0x30
009ebcb0	ret
