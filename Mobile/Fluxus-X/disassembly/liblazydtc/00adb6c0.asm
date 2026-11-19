; ossl_rsa_sp800_56b_generate_key @ 00adb6c0
00adb6c0	stp x24,x23,[sp, #-0x40]!
00adb6c4	mov x23,x0
00adb6c8	mov w0,w1
00adb6cc	stp x22,x21,[sp, #0x10]
00adb6d0	stp x20,x19,[sp, #0x20]
00adb6d4	stp x29,x30,[sp, #0x30]
00adb6d8	add x29,sp,#0x30
00adb6dc	mov x22,x3
00adb6e0	mov x20,x2
00adb6e4	mov w24,w1
00adb6e8	bl 0x00c39fe0
00adb6ec	ldr x0,[x23, #0x8]
00adb6f0	bl 0x00c3f930
00adb6f4	cbz x0,0x00adb774
00adb6f8	ldr x0,[x23, #0x8]
00adb6fc	bl 0x00c38a60
00adb700	cbz x0,0x00adb774
00adb704	mov x19,x0
00adb708	mov x21,x20
00adb70c	cbz x20,0x00adb788
00adb710	mov x0,x23
00adb714	mov w2,w24
00adb718	mov x3,x21
00adb71c	mov x4,x19
00adb720	mov x5,x22
00adb724	bl 0x00adb11c
00adb728	cbz w0,0x00adb77c
00adb72c	ldp x0,x1,[x23, #0x40]
00adb730	bl 0x00c38cc0
00adb734	tbz w0,#0x1f,0x00adb740
00adb738	ldp x9,x8,[x23, #0x40]
00adb73c	stp x8,x9,[x23, #0x40]
00adb740	mov x0,x23
00adb744	mov w1,w24
00adb748	mov x2,x21
00adb74c	mov x3,x19
00adb750	bl 0x00adb414
00adb754	tbnz w0,#0x1f,0x00adb77c
00adb758	cbz w0,0x00adb710
00adb75c	mov x0,x23
00adb760	mov x1,x19
00adb764	bl 0x00adb7d0
00adb768	mov w22,w0
00adb76c	cbnz x20,0x00adb7b0
00adb770	b 0x00adb7a8
00adb774	mov w22,wzr
00adb778	b 0x00adb7b8
00adb77c	mov w22,wzr
00adb780	cbnz x20,0x00adb7b0
00adb784	b 0x00adb7a8
00adb788	bl 0x00c37710
00adb78c	mov x21,x0
00adb790	cbz x0,0x00adb7a4
00adb794	orr w1,wzr,#0x10001
00adb798	mov x0,x21
00adb79c	bl 0x00c37720
00adb7a0	cbnz w0,0x00adb710
00adb7a4	mov w22,wzr
00adb7a8	mov x0,x21
00adb7ac	bl 0x00c36290
00adb7b0	mov x0,x19
00adb7b4	bl 0x00c38a30
00adb7b8	mov w0,w22
00adb7bc	ldp x29,x30,[sp, #0x30]
00adb7c0	ldp x20,x19,[sp, #0x20]
00adb7c4	ldp x22,x21,[sp, #0x10]
00adb7c8	ldp x24,x23,[sp], #0x40
00adb7cc	ret
