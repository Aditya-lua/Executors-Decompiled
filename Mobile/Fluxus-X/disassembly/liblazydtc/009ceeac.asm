; ssl3_cbc_record_digest_supported @ 009ceeac
009ceeac	stp x29,x30,[sp, #-0x10]!
009ceeb0	mov x29,sp
009ceeb4	bl 0x00c34c00
009ceeb8	bl 0x00c34c30
009ceebc	sub w9,w0,#0x2a0
009ceec0	mov w8,w0
009ceec4	cmp w9,#0x4
009ceec8	mov w0,#0x1
009ceecc	b.cc 0x009ceee4
009ceed0	cmp w8,#0x4
009ceed4	b.eq 0x009ceee4
009ceed8	cmp w8,#0x40
009ceedc	b.eq 0x009ceee4
009ceee0	mov w0,wzr
009ceee4	ldp x29,x30,[sp], #0x10
009ceee8	ret
