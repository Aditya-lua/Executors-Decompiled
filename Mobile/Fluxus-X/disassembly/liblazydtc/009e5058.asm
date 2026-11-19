; ssl_check_version_downgrade @ 009e5058
009e5058	stp x20,x19,[sp, #-0x20]!
009e505c	stp x29,x30,[sp, #0x10]
009e5060	ldr x8,[x0, #0x9a8]
009e5064	ldr w9,[x0]
009e5068	add x29,sp,#0x10
009e506c	ldr x8,[x8, #0x8]
009e5070	ldr w20,[x8]
009e5074	cmp w9,w20
009e5078	b.ne 0x009e5084
009e507c	mov w0,#0x1
009e5080	b 0x009e511c
009e5084	mov x19,x0
009e5088	bl 0x00c32a40
009e508c	ldr w8,[x0]
009e5090	cmp w20,w8
009e5094	b.ne 0x009e50ac
009e5098	adrp x8,0xc58000
009e509c	add x8,x8,#0x798
009e50a0	ldr w9,[x8]
009e50a4	cbnz w9,0x009e50dc
009e50a8	b 0x009e5104
009e50ac	ldr x8,[x19, #0x9a8]
009e50b0	ldr x8,[x8, #0x8]
009e50b4	ldr w20,[x8]
009e50b8	bl 0x00c34170
009e50bc	ldr w8,[x0]
009e50c0	mov w0,wzr
009e50c4	cmp w20,w8
009e50c8	b.ne 0x009e511c
009e50cc	adrp x8,0xc58000
009e50d0	add x8,x8,#0x828
009e50d4	ldr w9,[x8]
009e50d8	cbz w9,0x009e5104
009e50dc	add x20,x8,#0x18
009e50e0	ldur x8,[x20, #-0x8]
009e50e4	cbz x8,0x009e50fc
009e50e8	blr x8
009e50ec	mov x1,x0
009e50f0	mov x0,x19
009e50f4	bl 0x009e4f38
009e50f8	cbz w0,0x009e510c
009e50fc	ldr w8,[x20], #0x18
009e5100	cbnz w8,0x009e50e0
009e5104	mov w0,wzr
009e5108	b 0x009e511c
009e510c	ldr w8,[x19]
009e5110	ldur w9,[x20, #-0x18]
009e5114	cmp w8,w9
009e5118	cset w0,eq
009e511c	ldp x29,x30,[sp, #0x10]
009e5120	ldp x20,x19,[sp], #0x20
009e5124	ret
