; tls_parse_stoc_ems @ 009d522c
009d522c	ldrb w8,[x0, #0x9e8]
009d5230	tbnz w8,#0x0,0x009d5248
009d5234	ldr x8,[x0, #0xa8]
009d5238	ldr w9,[x0, #0x4d0]
009d523c	orr x8,x8,#0x200
009d5240	str x8,[x0, #0xa8]
009d5244	cbz w9,0x009d5250
009d5248	mov w0,#0x1
009d524c	ret
009d5250	ldr x8,[x0, #0x918]
009d5254	ldr w9,[x8, #0x388]
009d5258	orr w9,w9,#0x1
009d525c	str w9,[x8, #0x388]
009d5260	mov w0,#0x1
009d5264	ret
