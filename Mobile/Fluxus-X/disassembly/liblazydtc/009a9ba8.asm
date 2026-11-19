; ssl_get_algorithm2 @ 009a9ba8
009a9ba8	ldr x8,[x0, #0x2e0]
009a9bac	cbz x8,0x009a9be4
009a9bb0	ldr x9,[x0, #0x8]
009a9bb4	ldr w0,[x8, #0x40]
009a9bb8	ldr x9,[x9, #0xc0]
009a9bbc	ldrb w9,[x9, #0x60]
009a9bc0	tbnz w9,#0x2,0x009a9bec
009a9bc4	cmp w0,#0x505
009a9bc8	b.ne 0x009a9bfc
009a9bcc	ldr w8,[x8, #0x1c]
009a9bd0	mov w9,#0x1c8
009a9bd4	and w8,w8,w9
009a9bd8	cbz w8,0x009a9bfc
009a9bdc	mov w0,#0x909
009a9be0	b 0x009a9bfc
009a9be4	mov x0,#-0x1
009a9be8	ret
009a9bec	cmp w0,#0x909
009a9bf0	b.ne 0x009a9bfc
009a9bf4	mov w0,#0x404
009a9bf8	ret
009a9bfc	ret
