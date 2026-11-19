; EVP_MD_do_all_sorted @ 00a69790
00a69790	sub sp,sp,#0x30
00a69794	stp x20,x19,[sp, #0x10]
00a69798	mov x19,x1
00a6979c	mov x20,x0
00a697a0	mov w0,#0x8
00a697a4	mov x1,xzr
00a697a8	stp x29,x30,[sp, #0x20]
00a697ac	add x29,sp,#0x20
00a697b0	bl 0x00c35500
00a697b4	adrp x1,0xa69000
00a697b8	add x1,x1,#0x75c
00a697bc	mov w0,#0x1
00a697c0	mov x2,sp
00a697c4	stp x19,x20,[sp]
00a697c8	bl 0x00c3d840
00a697cc	ldp x29,x30,[sp, #0x20]
00a697d0	ldp x20,x19,[sp, #0x10]
00a697d4	add sp,sp,#0x30
00a697d8	ret
