; SRP_Calc_server_key @ 00ae6890
00ae6890	stp x26,x25,[sp, #-0x50]!
00ae6894	stp x22,x21,[sp, #0x20]
00ae6898	mov x21,xzr
00ae689c	stp x24,x23,[sp, #0x10]
00ae68a0	stp x20,x19,[sp, #0x30]
00ae68a4	stp x29,x30,[sp, #0x40]
00ae68a8	add x29,sp,#0x40
00ae68ac	cbz x4,0x00ae6970
00ae68b0	mov x23,x3
00ae68b4	cbz x3,0x00ae6970
00ae68b8	mov x26,x1
00ae68bc	cbz x1,0x00ae6970
00ae68c0	mov x24,x0
00ae68c4	cbz x0,0x00ae6970
00ae68c8	mov x25,x2
00ae68cc	cbz x2,0x00ae6970
00ae68d0	mov x22,x4
00ae68d4	bl 0x00c38a50
00ae68d8	mov x19,x0
00ae68dc	cbz x0,0x00ae6958
00ae68e0	bl 0x00c37710
00ae68e4	mov x20,x0
00ae68e8	cbz x0,0x00ae695c
00ae68ec	mov x0,x20
00ae68f0	mov x1,x26
00ae68f4	mov x2,x25
00ae68f8	mov x3,x22
00ae68fc	mov x4,x19
00ae6900	bl 0x00c38ad0
00ae6904	cbz w0,0x00ae695c
00ae6908	mov x0,x20
00ae690c	mov x1,x24
00ae6910	mov x2,x20
00ae6914	mov x3,x22
00ae6918	mov x4,x19
00ae691c	bl 0x00c38ef0
00ae6920	cbz w0,0x00ae695c
00ae6924	bl 0x00c37710
00ae6928	mov x21,x0
00ae692c	cbz x0,0x00ae6960
00ae6930	mov x0,x21
00ae6934	mov x1,x20
00ae6938	mov x2,x23
00ae693c	mov x3,x22
00ae6940	mov x4,x19
00ae6944	bl 0x00c38ad0
00ae6948	cbnz w0,0x00ae6960
00ae694c	mov x0,x21
00ae6950	bl 0x00c36290
00ae6954	b 0x00ae695c
00ae6958	mov x20,xzr
00ae695c	mov x21,xzr
00ae6960	mov x0,x19
00ae6964	bl 0x00c38a30
00ae6968	mov x0,x20
00ae696c	bl 0x00c322e0
00ae6970	mov x0,x21
00ae6974	ldp x29,x30,[sp, #0x40]
00ae6978	ldp x20,x19,[sp, #0x30]
00ae697c	ldp x22,x21,[sp, #0x20]
00ae6980	ldp x24,x23,[sp, #0x10]
00ae6984	ldp x26,x25,[sp], #0x50
00ae6988	ret
