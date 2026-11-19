; ssl3_new @ 009a8018
009a8018	str x19,[sp, #-0x20]!
009a801c	stp x29,x30,[sp, #0x10]
009a8020	add x29,sp,#0x10
009a8024	mov x19,x0
009a8028	bl 0x00c34a90
009a802c	cbz w0,0x009a8048
009a8030	ldr x8,[x19, #0x8]
009a8034	mov x0,x19
009a8038	ldr x8,[x8, #0x18]
009a803c	blr x8
009a8040	cmp w0,#0x0
009a8044	cset w0,ne
009a8048	ldp x29,x30,[sp, #0x10]
009a804c	ldr x19,[sp], #0x20
009a8050	ret
