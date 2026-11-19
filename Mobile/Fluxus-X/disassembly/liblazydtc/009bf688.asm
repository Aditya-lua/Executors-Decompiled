; SSL_state_string_long @ 009bf688
009bf688	str x19,[sp, #-0x20]!
009bf68c	stp x29,x30,[sp, #0x10]
009bf690	add x29,sp,#0x10
009bf694	mov x19,x0
009bf698	bl 0x00c35ce0
009bf69c	cbz w0,0x009bf6ac
009bf6a0	adrp x0,0x2c3000
009bf6a4	add x0,x0,#0x599
009bf6a8	b 0x009bf6d4
009bf6ac	mov x0,x19
009bf6b0	bl 0x00c361a0
009bf6b4	cmp w0,#0x31
009bf6b8	b.hi 0x009bf6cc
009bf6bc	adrp x8,0xc57000
009bf6c0	add x8,x8,#0x800
009bf6c4	ldr x0,[x8, w0, SXTW #0x3]
009bf6c8	b 0x009bf6d4
009bf6cc	adrp x0,0x2cb000
009bf6d0	add x0,x0,#0x4a6
009bf6d4	ldp x29,x30,[sp, #0x10]
009bf6d8	ldr x19,[sp], #0x20
009bf6dc	ret
