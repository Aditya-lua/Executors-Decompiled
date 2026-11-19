; ssl_cert_set_current @ 009ac9f8
009ac9f8	cbz x0,0x009aca7c
009ac9fc	cmp x1,#0x1
009aca00	b.eq 0x009aca44
009aca04	cmp x1,#0x2
009aca08	mov w8,wzr
009aca0c	b.ne 0x009aca3c
009aca10	mov x8,x0
009aca14	ldr x9,[x8], #0x20
009aca18	mov w10,#0xcccd
009aca1c	movk w10,#0xcccc, LSL #16
009aca20	sub x8,x9,x8
009aca24	lsr x8,x8,#0x3
009aca28	mov w9,#0x1
009aca2c	madd w9,w8,w10,w9
009aca30	cmp w9,#0x8
009aca34	mov w8,wzr
009aca38	b.le 0x009aca48
009aca3c	mov w0,w8
009aca40	ret
009aca44	mov w9,wzr
009aca48	mov w8,#0x28
009aca4c	sxtw x10,w9
009aca50	smaddl x9,w9,w8,x0
009aca54	sub x8,x10,#0x1
009aca58	add x9,x9,#0x20
009aca5c	ldr x10,[x9]
009aca60	cbz x10,0x009aca6c
009aca64	ldr x10,[x9, #0x8]
009aca68	cbnz x10,0x009aca88
009aca6c	add x8,x8,#0x1
009aca70	cmp x8,#0x8
009aca74	add x9,x9,#0x28
009aca78	b.lt 0x009aca5c
009aca7c	mov w8,wzr
009aca80	mov w0,w8
009aca84	ret
009aca88	mov w8,#0x1
009aca8c	str x9,[x0]
009aca90	mov w0,w8
009aca94	ret
