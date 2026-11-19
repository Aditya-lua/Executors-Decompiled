; ossl_dh_is_foreign @ 00a19754
00a19754	ldr x8,[x0, #0xa8]
00a19758	cbz x8,0x00a19764
00a1975c	mov w0,#0x1
00a19760	ret
00a19764	str x19,[sp, #-0x20]!
00a19768	stp x29,x30,[sp, #0x10]
00a1976c	add x29,sp,#0x10
00a19770	bl 0x00c39d80
00a19774	mov x19,x0
00a19778	bl 0x00c39d00
00a1977c	ldp x29,x30,[sp, #0x10]
00a19780	cmp x19,x0
00a19784	cset w0,ne
00a19788	ldr x19,[sp], #0x20
00a1978c	ret
