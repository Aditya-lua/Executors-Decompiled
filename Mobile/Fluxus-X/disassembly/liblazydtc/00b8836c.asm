; psa_hash_clone @ 00b8836c
00b8836c	str x21,[sp, #-0x30]!
00b88370	stp x20,x19,[sp, #0x10]
00b88374	stp x29,x30,[sp, #0x20]
00b88378	add x29,sp,#0x20
00b8837c	ldr w8,[x0]
00b88380	mov x20,x1
00b88384	cbz w8,0x00b883dc
00b88388	cmp w8,#0x1
00b8838c	mov w19,#0xffffff77
00b88390	b.ne 0x00b883e0
00b88394	ldr w8,[x20]
00b88398	cbnz w8,0x00b883e0
00b8839c	mov w8,#0x1
00b883a0	mov x21,x20
00b883a4	str w8,[x21], #0x8
00b883a8	add x0,x0,#0x8
00b883ac	mov x1,x21
00b883b0	bl 0x00c42ff0
00b883b4	mov w19,w0
00b883b8	cbz w0,0x00b883e0
00b883bc	ldr w8,[x20]
00b883c0	cbz w8,0x00b883e0
00b883c4	cmp w8,#0x1
00b883c8	b.ne 0x00b883d4
00b883cc	mov x0,x21
00b883d0	bl 0x00c42fe0
00b883d4	str wzr,[x20]
00b883d8	b 0x00b883e0
00b883dc	mov w19,#0xffffff77
00b883e0	mov w0,w19
00b883e4	ldp x29,x30,[sp, #0x20]
00b883e8	ldp x20,x19,[sp, #0x10]
00b883ec	ldr x21,[sp], #0x30
00b883f0	ret
