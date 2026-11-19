; FUN_00b4d654 @ 00b4d654
00b4d654	cbz x0,0x00b4d6b8
00b4d658	stp x20,x19,[sp, #-0x20]!
00b4d65c	stp x29,x30,[sp, #0x10]
00b4d660	mov x19,x0
00b4d664	ldr x0,[x0, #0x48]
00b4d668	adrp x20,0x2b3000
00b4d66c	add x20,x20,#0x30
00b4d670	mov w2,#0x277
00b4d674	mov x1,x20
00b4d678	add x29,sp,#0x10
00b4d67c	bl 0x00c32310
00b4d680	ldr x0,[x19, #0x50]
00b4d684	mov w2,#0x278
00b4d688	mov x1,x20
00b4d68c	bl 0x00c32310
00b4d690	ldp x0,x1,[x19, #0x28]
00b4d694	mov w3,#0x279
00b4d698	mov x2,x20
00b4d69c	bl 0x00c345e0
00b4d6a0	ldp x29,x30,[sp, #0x10]
00b4d6a4	mov w2,#0x27a
00b4d6a8	mov x0,x19
00b4d6ac	mov x1,x20
00b4d6b0	ldp x20,x19,[sp], #0x20
00b4d6b4	b 0x00c32310
00b4d6b8	ret
