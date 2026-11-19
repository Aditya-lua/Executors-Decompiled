; X509_EXTENSION_set_object @ 00b0d75c
00b0d75c	stp x20,x19,[sp, #-0x20]!
00b0d760	mov x19,x0
00b0d764	mov w0,wzr
00b0d768	stp x29,x30,[sp, #0x10]
00b0d76c	add x29,sp,#0x10
00b0d770	cbz x19,0x00b0d798
00b0d774	mov x20,x1
00b0d778	cbz x1,0x00b0d798
00b0d77c	ldr x0,[x19]
00b0d780	bl 0x00c37660
00b0d784	mov x0,x20
00b0d788	bl 0x00c37730
00b0d78c	cmp x0,#0x0
00b0d790	str x0,[x19]
00b0d794	cset w0,ne
00b0d798	ldp x29,x30,[sp, #0x10]
00b0d79c	ldp x20,x19,[sp], #0x20
00b0d7a0	ret
