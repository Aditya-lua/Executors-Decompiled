; FUN_00b4f5a8 @ 00b4f5a8
00b4f5a8	stp x22,x21,[sp, #-0x30]!
00b4f5ac	stp x20,x19,[sp, #0x10]
00b4f5b0	stp x29,x30,[sp, #0x20]
00b4f5b4	add x29,sp,#0x20
00b4f5b8	mov x20,x0
00b4f5bc	bl 0x00c364c0
00b4f5c0	cbz x0,0x00b4f664
00b4f5c4	ldr x2,[x20, #0x10]
00b4f5c8	mov x19,x0
00b4f5cc	cbz x2,0x00b4f5e8
00b4f5d0	adrp x1,0x2a3000
00b4f5d4	add x1,x1,#0xf03
00b4f5d8	mov x0,x19
00b4f5dc	mov x3,xzr
00b4f5e0	bl 0x00c3e890
00b4f5e4	cbz w0,0x00b4f764
00b4f5e8	ldr x2,[x20, #0x18]
00b4f5ec	cbz x2,0x00b4f608
00b4f5f0	adrp x1,0x2cb000
00b4f5f4	add x1,x1,#0x7b8
00b4f5f8	mov x0,x19
00b4f5fc	mov x3,xzr
00b4f600	bl 0x00c3e890
00b4f604	cbz w0,0x00b4f764
00b4f608	ldr x2,[x20, #0x8]
00b4f60c	cbz x2,0x00b4f66c
00b4f610	adrp x1,0x2a2000
00b4f614	add x1,x1,#0x238
00b4f618	mov x0,x19
00b4f61c	mov x3,xzr
00b4f620	bl 0x00c3e890
00b4f624	cbz w0,0x00b4f764
00b4f628	mov x0,x19
00b4f62c	bl 0x00c364f0
00b4f630	mov x21,x0
00b4f634	cbz x0,0x00b4f790
00b4f638	ldr x1,[x20]
00b4f63c	mov x0,x21
00b4f640	mov x2,xzr
00b4f644	bl 0x00c3ac50
00b4f648	cbz x0,0x00b4f790
00b4f64c	mov x22,x0
00b4f650	ldr x0,[x20, #0x80]
00b4f654	bl 0x00c3a770
00b4f658	str x22,[x20, #0x80]
00b4f65c	mov w20,#0x1
00b4f660	b 0x00b4f76c
00b4f664	mov w20,wzr
00b4f668	b 0x00b4f77c
00b4f66c	ldr x2,[x20, #0x28]
00b4f670	cbz x2,0x00b4f764
00b4f674	adrp x1,0x2a0000
00b4f678	add x1,x1,#0x20
00b4f67c	mov x0,x19
00b4f680	mov x3,xzr
00b4f684	bl 0x00c3e890
00b4f688	cbz w0,0x00b4f764
00b4f68c	ldr x2,[x20, #0x30]
00b4f690	cbz x2,0x00b4f764
00b4f694	ldr x8,[x20, #0x38]
00b4f698	cbz x8,0x00b4f764
00b4f69c	ldr x8,[x20, #0x40]
00b4f6a0	cbz x8,0x00b4f764
00b4f6a4	ldr x8,[x20, #0x48]
00b4f6a8	cbz x8,0x00b4f764
00b4f6ac	adrp x1,0x2a3000
00b4f6b0	add x1,x1,#0x8e7
00b4f6b4	mov x0,x19
00b4f6b8	bl 0x00c364d0
00b4f6bc	cbz w0,0x00b4f764
00b4f6c0	ldr x2,[x20, #0x38]
00b4f6c4	adrp x1,0x2a3000
00b4f6c8	add x1,x1,#0x74f
00b4f6cc	mov x0,x19
00b4f6d0	bl 0x00c364d0
00b4f6d4	cbz w0,0x00b4f764
00b4f6d8	ldr x2,[x20, #0x40]
00b4f6dc	adrp x1,0x2ad000
00b4f6e0	add x1,x1,#0xabd
00b4f6e4	mov x0,x19
00b4f6e8	bl 0x00c364d0
00b4f6ec	cbz w0,0x00b4f764
00b4f6f0	ldr x2,[x20, #0x48]
00b4f6f4	adrp x1,0x2bb000
00b4f6f8	add x1,x1,#0xa73
00b4f6fc	mov x0,x19
00b4f700	bl 0x00c364d0
00b4f704	cbz w0,0x00b4f764
00b4f708	ldr x2,[x20, #0x50]
00b4f70c	cbz x2,0x00b4f724
00b4f710	adrp x1,0x2ab000
00b4f714	add x1,x1,#0xf4d
00b4f718	mov x0,x19
00b4f71c	bl 0x00c364d0
00b4f720	cbz w0,0x00b4f764
00b4f724	ldr x2,[x20, #0x60]
00b4f728	cbz x2,0x00b4f744
00b4f72c	ldr x3,[x20, #0x70]
00b4f730	adrp x1,0x2bb000
00b4f734	add x1,x1,#0x864
00b4f738	mov x0,x19
00b4f73c	bl 0x00c3a8f0
00b4f740	cbz w0,0x00b4f764
00b4f744	ldr x2,[x20, #0x58]
00b4f748	cbz x2,0x00b4f764
00b4f74c	ldr x3,[x20, #0x68]
00b4f750	adrp x1,0x2c5000
00b4f754	add x1,x1,#0x89e
00b4f758	mov x0,x19
00b4f75c	bl 0x00c3a8f0
00b4f760	cbnz w0,0x00b4f628
00b4f764	mov w20,wzr
00b4f768	mov x21,xzr
00b4f76c	mov x0,x21
00b4f770	bl 0x00c36500
00b4f774	mov x0,x19
00b4f778	bl 0x00c364b0
00b4f77c	mov w0,w20
00b4f780	ldp x29,x30,[sp, #0x20]
00b4f784	ldp x20,x19,[sp, #0x10]
00b4f788	ldp x22,x21,[sp], #0x30
00b4f78c	ret
00b4f790	mov w20,wzr
00b4f794	b 0x00b4f76c
