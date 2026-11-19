; ssl_clear_bad_session @ 009be63c
009be63c	stp x20,x19,[sp, #-0x20]!
009be640	stp x29,x30,[sp, #0x10]
009be644	ldr x8,[x0, #0x918]
009be648	add x29,sp,#0x10
009be64c	cbz x8,0x009be698
009be650	ldrb w8,[x0, #0x44]
009be654	mov x19,x0
009be658	mov w20,wzr
009be65c	tbnz w8,#0x0,0x009be69c
009be660	mov x0,x19
009be664	bl 0x00c344e0
009be668	mov w20,wzr
009be66c	cbnz w0,0x009be69c
009be670	mov x0,x19
009be674	bl 0x00c347f0
009be678	mov w20,wzr
009be67c	cbnz w0,0x009be69c
009be680	ldr x0,[x19, #0xb88]
009be684	ldr x1,[x19, #0x918]
009be688	mov w2,#0x1
009be68c	mov w20,#0x1
009be690	bl 0x009be2fc
009be694	b 0x009be69c
009be698	mov w20,wzr
009be69c	ldp x29,x30,[sp, #0x10]
009be6a0	mov w0,w20
009be6a4	ldp x20,x19,[sp], #0x20
009be6a8	ret
