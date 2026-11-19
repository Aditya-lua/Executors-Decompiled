; ossl_rsa_sp800_56b_pairwise_test @ 00adb7d0
00adb7d0	stp x22,x21,[sp, #-0x30]!
00adb7d4	mov x21,x0
00adb7d8	mov x0,x1
00adb7dc	stp x20,x19,[sp, #0x10]
00adb7e0	stp x29,x30,[sp, #0x20]
00adb7e4	add x29,sp,#0x20
00adb7e8	mov x19,x1
00adb7ec	bl 0x00c38a90
00adb7f0	mov x0,x19
00adb7f4	bl 0x00c38a40
00adb7f8	mov x20,x0
00adb7fc	mov x0,x19
00adb800	bl 0x00c38a40
00adb804	cbz x0,0x00adb894
00adb808	mov w1,#0x4
00adb80c	mov x22,x0
00adb810	bl 0x00c38dc0
00adb814	mov w1,#0x2
00adb818	mov x0,x22
00adb81c	bl 0x00c37720
00adb820	cbz w0,0x00adb868
00adb824	ldp x3,x2,[x21, #0x28]
00adb828	mov x0,x20
00adb82c	mov x1,x22
00adb830	mov x4,x19
00adb834	bl 0x00c38ad0
00adb838	cbz w0,0x00adb868
00adb83c	ldr x2,[x21, #0x38]
00adb840	ldr x3,[x21, #0x28]
00adb844	mov x0,x20
00adb848	mov x1,x20
00adb84c	mov x4,x19
00adb850	bl 0x00c38ad0
00adb854	cbz w0,0x00adb868
00adb858	mov x0,x22
00adb85c	mov x1,x20
00adb860	bl 0x00c38cc0
00adb864	cbz w0,0x00adb8b4
00adb868	bl 0x00c342a0
00adb86c	adrp x0,0x2aa000
00adb870	adrp x2,0x2c4000
00adb874	add x0,x0,#0x974
00adb878	add x2,x2,#0x236
00adb87c	mov w1,#0x1bd
00adb880	bl 0x00c342b0
00adb884	mov w0,#0x4
00adb888	mov w1,#0xb1
00adb88c	mov x2,xzr
00adb890	bl 0x00c342c0
00adb894	mov w20,wzr
00adb898	mov x0,x19
00adb89c	bl 0x00c38a20
00adb8a0	mov w0,w20
00adb8a4	ldp x29,x30,[sp, #0x20]
00adb8a8	ldp x20,x19,[sp, #0x10]
00adb8ac	ldp x22,x21,[sp], #0x30
00adb8b0	ret
00adb8b4	mov w20,#0x1
00adb8b8	b 0x00adb898
