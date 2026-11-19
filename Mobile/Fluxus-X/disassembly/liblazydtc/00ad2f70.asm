; EVP_PKEY_CTX_set_rsa_keygen_primes @ 00ad2f70
00ad2f70	sub sp,sp,#0xa0
00ad2f74	stp x29,x30,[sp, #0x90]
00ad2f78	add x29,sp,#0x90
00ad2f7c	sxtw x8,w1
00ad2f80	str x19,[sp, #0x80]
00ad2f84	stur x8,[x29, #-0x8]
00ad2f88	cbz x0,0x00ad3024
00ad2f8c	ldr w8,[x0]
00ad2f90	mov x19,x0
00ad2f94	cmp w8,#0x2
00ad2f98	b.eq 0x00ad2fa4
00ad2f9c	cmp w8,#0x4
00ad2fa0	b.ne 0x00ad3024
00ad2fa4	adrp x1,0x2db000
00ad2fa8	add x1,x1,#0x996
00ad2fac	mov x0,x19
00ad2fb0	bl 0x00c3dc40
00ad2fb4	cbnz w0,0x00ad2fcc
00ad2fb8	adrp x1,0x2b9000
00ad2fbc	add x1,x1,#0x9cf
00ad2fc0	mov x0,x19
00ad2fc4	bl 0x00c3dc40
00ad2fc8	cbz w0,0x00ad3064
00ad2fcc	adrp x0,0x2ad000
00ad2fd0	add x0,x0,#0xcb6
00ad2fd4	add x8,sp,#0x8
00ad2fd8	sub x1,x29,#0x8
00ad2fdc	bl 0x00c36270
00ad2fe0	ldr x8,[sp, #0x28]
00ad2fe4	ldur q0,[sp, #0x18]
00ad2fe8	ldur q1,[sp, #0x8]
00ad2fec	str x8,[sp, #0x50]
00ad2ff0	add x8,sp,#0x8
00ad2ff4	stp q1,q0,[sp, #0x30]
00ad2ff8	bl 0x00c34c40
00ad2ffc	ldr x8,[sp, #0x28]
00ad3000	ldur q0,[sp, #0x18]
00ad3004	ldur q1,[sp, #0x8]
00ad3008	add x1,sp,#0x30
00ad300c	mov x0,x19
00ad3010	str x8,[sp, #0x78]
00ad3014	stur q0,[sp, #0x68]
00ad3018	stur q1,[sp, #0x58]
00ad301c	bl 0x00c3c120
00ad3020	b 0x00ad3054
00ad3024	bl 0x00c342a0
00ad3028	adrp x0,0x2b0000
00ad302c	adrp x2,0x2c4000
00ad3030	add x0,x0,#0x862
00ad3034	add x2,x2,#0x1d5
00ad3038	mov w1,#0x509
00ad303c	bl 0x00c342b0
00ad3040	orr w0,wzr,#0x6
00ad3044	mov w1,#0x93
00ad3048	mov x2,xzr
00ad304c	bl 0x00c342c0
00ad3050	orr w0,wzr,#0xfffffffe
00ad3054	ldp x29,x30,[sp, #0x90]
00ad3058	ldr x19,[sp, #0x80]
00ad305c	add sp,sp,#0xa0
00ad3060	ret
00ad3064	mov w0,#0xffffffff
00ad3068	b 0x00ad3054
