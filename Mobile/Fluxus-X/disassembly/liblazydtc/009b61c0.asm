; SSL_export_keying_material @ 009b61c0
009b61c0	ldr x8,[x0, #0x918]
009b61c4	cbz x8,0x009b61dc
009b61c8	ldr w8,[x0]
009b61cc	cmp w8,#0x300
009b61d0	b.gt 0x009b61e4
009b61d4	cmp w8,#0x100
009b61d8	b.eq 0x009b61e4
009b61dc	mov w0,#0xffffffff
009b61e0	ret
009b61e4	ldr x8,[x0, #0x8]
009b61e8	ldr x8,[x8, #0xc0]
009b61ec	ldr x8,[x8, #0x58]
009b61f0	br x8
