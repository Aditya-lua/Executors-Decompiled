; FUN_00a1f740 @ 00a1f740
00a1f740	stp x29,x30,[sp, #-0x10]!
00a1f744	ldr x8,[x1, #0x20]
00a1f748	ldr x9,[x0, #0x20]
00a1f74c	mov x29,sp
00a1f750	ldr x0,[x8, #0x68]
00a1f754	ldr x1,[x9, #0x68]
00a1f758	bl 0x00c38cc0
00a1f75c	cmp w0,#0x0
00a1f760	cset w0,eq
00a1f764	ldp x29,x30,[sp], #0x10
00a1f768	ret
