; BN_mod_lshift1_quick @ 00a09594
00a09594	stp x20,x19,[sp, #-0x20]!
00a09598	stp x29,x30,[sp, #0x10]
00a0959c	add x29,sp,#0x10
00a095a0	mov x19,x2
00a095a4	mov x20,x0
00a095a8	bl 0x00c39050
00a095ac	cbz w0,0x00a095dc
00a095b0	mov x0,x20
00a095b4	mov x1,x19
00a095b8	bl 0x00c38cc0
00a095bc	tbnz w0,#0x1f,0x00a095d8
00a095c0	ldp x29,x30,[sp, #0x10]
00a095c4	mov x0,x20
00a095c8	mov x1,x20
00a095cc	mov x2,x19
00a095d0	ldp x20,x19,[sp], #0x20
00a095d4	b 0x00c38880
00a095d8	mov w0,#0x1
00a095dc	ldp x29,x30,[sp, #0x10]
00a095e0	ldp x20,x19,[sp], #0x20
00a095e4	ret
