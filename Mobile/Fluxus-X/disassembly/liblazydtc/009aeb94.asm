; SSL_set_ciphersuites @ 009aeb94
009aeb94	str x21,[sp, #-0x30]!
009aeb98	stp x20,x19,[sp, #0x10]
009aeb9c	mov x19,x0
009aeba0	add x0,x0,#0x538
009aeba4	stp x29,x30,[sp, #0x20]
009aeba8	add x29,sp,#0x20
009aebac	bl 0x009ae98c
009aebb0	ldr x8,[x19, #0x528]
009aebb4	mov w20,w0
009aebb8	add x21,x19,#0x528
009aebbc	cbnz x8,0x009aebd4
009aebc0	mov x0,x19
009aebc4	bl 0x00c35380
009aebc8	cbz x0,0x009aebd4
009aebcc	bl 0x00c35330
009aebd0	str x0,[x21]
009aebd4	cbz w20,0x009aec00
009aebd8	ldr x8,[x21]
009aebdc	cbz x8,0x009aec00
009aebe0	ldr x0,[x19, #0x9a8]
009aebe4	ldr x3,[x19, #0x538]
009aebe8	add x2,x19,#0x530
009aebec	ldp x29,x30,[sp, #0x20]
009aebf0	ldp x20,x19,[sp, #0x10]
009aebf4	mov x1,x21
009aebf8	ldr x21,[sp], #0x30
009aebfc	b 0x009aea44
009aec00	mov w0,w20
009aec04	ldp x29,x30,[sp, #0x20]
009aec08	ldp x20,x19,[sp, #0x10]
009aec0c	ldr x21,[sp], #0x30
009aec10	ret
