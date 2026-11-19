; DH_security_bits @ 00a1f1e4
00a1f1e4	stp x20,x19,[sp, #-0x20]!
00a1f1e8	stp x29,x30,[sp, #0x10]
00a1f1ec	mov x19,x0
00a1f1f0	ldr x0,[x0, #0x10]
00a1f1f4	add x29,sp,#0x10
00a1f1f8	cbz x0,0x00a1f220
00a1f1fc	bl 0x00c322f0
00a1f200	mov w20,w0
00a1f204	ldr x0,[x19, #0x8]
00a1f208	cbz x0,0x00a1f234
00a1f20c	bl 0x00c322f0
00a1f210	ldp x29,x30,[sp, #0x10]
00a1f214	mov w1,w20
00a1f218	ldp x20,x19,[sp], #0x20
00a1f21c	b 0x00c38da0
00a1f220	ldr w8,[x19, #0x68]
00a1f224	cmp w8,#0x0
00a1f228	csinv w20,w8,wzr,ne
00a1f22c	ldr x0,[x19, #0x8]
00a1f230	cbnz x0,0x00a1f20c
00a1f234	ldp x29,x30,[sp, #0x10]
00a1f238	mov w0,#0xffffffff
00a1f23c	ldp x20,x19,[sp], #0x20
00a1f240	ret
