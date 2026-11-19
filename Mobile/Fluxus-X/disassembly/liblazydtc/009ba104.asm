; SSL_CONF_cmd_value_type @ 009ba104
009ba104	str x19,[sp, #-0x20]!
009ba108	str x1,[sp, #0x8]
009ba10c	add x1,sp,#0x8
009ba110	stp x29,x30,[sp, #0x10]
009ba114	add x29,sp,#0x10
009ba118	mov x19,x0
009ba11c	bl 0x009b9ec0
009ba120	cbz w0,0x009ba138
009ba124	ldr x1,[sp, #0x8]
009ba128	mov x0,x19
009ba12c	bl 0x009b9fa4
009ba130	cbz x0,0x009ba138
009ba134	ldrh w0,[x0, #0x1a]
009ba138	ldp x29,x30,[sp, #0x10]
009ba13c	ldr x19,[sp], #0x20
009ba140	ret
