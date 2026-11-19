; ssl_build_cert_chain @ 009ad87c
009ad87c	stp x28,x27,[sp, #-0x60]!
009ad880	add x8,x0,#0x898
009ad884	add x9,x1,#0x158
009ad888	cmp x0,#0x0
009ad88c	stp x26,x25,[sp, #0x10]
009ad890	stp x24,x23,[sp, #0x20]
009ad894	stp x22,x21,[sp, #0x30]
009ad898	stp x20,x19,[sp, #0x40]
009ad89c	stp x29,x30,[sp, #0x50]
009ad8a0	csel x8,x8,x9,ne
009ad8a4	ldr x25,[x8]
009ad8a8	mov w23,w2
009ad8ac	mov x21,x1
009ad8b0	mov x22,x0
009ad8b4	ldr x27,[x25]
009ad8b8	mov x28,x1
009ad8bc	add x29,sp,#0x50
009ad8c0	cbz x0,0x009ad8c8
009ad8c4	ldr x28,[x22, #0x9a8]
009ad8c8	ldr x8,[x27]
009ad8cc	cbz x8,0x009ad8e8
009ad8d0	and w26,w23,#0x4
009ad8d4	tbnz w23,#0x2,0x009ad92c
009ad8d8	ldr x19,[x25, #0x1c8]
009ad8dc	cbz x19,0x009ad99c
009ad8e0	tbz w23,#0x0,0x009ad9b0
009ad8e4	b 0x009ad9b8
009ad8e8	bl 0x00c342a0
009ad8ec	adrp x0,0x2d5000
009ad8f0	adrp x2,0x2a7000
009ad8f4	add x0,x0,#0x6b3
009ad8f8	add x2,x2,#0x9aa
009ad8fc	mov w1,#0x376
009ad900	bl 0x00c342b0
009ad904	mov w0,#0x14
009ad908	mov w1,#0xb3
009ad90c	mov x2,xzr
009ad910	bl 0x00c342c0
009ad914	mov x20,xzr
009ad918	mov x19,xzr
009ad91c	mov w21,wzr
009ad920	and w26,w23,#0x4
009ad924	cbnz w26,0x009ada8c
009ad928	b 0x009ada94
009ad92c	bl 0x00c35030
009ad930	mov x19,x0
009ad934	cbz x0,0x009ada48
009ad938	ldr x0,[x27, #0x10]
009ad93c	bl 0x00c325e0
009ad940	cmp w0,#0x1
009ad944	b.lt 0x009ad97c
009ad948	mov w20,wzr
009ad94c	ldr x0,[x27, #0x10]
009ad950	mov w1,w20
009ad954	bl 0x00c32610
009ad958	mov x1,x0
009ad95c	mov x0,x19
009ad960	bl 0x00c31a80
009ad964	cbz w0,0x009ad98c
009ad968	ldr x0,[x27, #0x10]
009ad96c	add w20,w20,#0x1
009ad970	bl 0x00c325e0
009ad974	cmp w20,w0
009ad978	b.lt 0x009ad94c
009ad97c	ldr x1,[x27]
009ad980	mov x0,x19
009ad984	bl 0x00c31a80
009ad988	cbnz w0,0x009ad9b0
009ad98c	mov x20,xzr
009ad990	mov w21,wzr
009ad994	cbnz w26,0x009ada8c
009ad998	b 0x009ada94
009ad99c	mov x8,x21
009ad9a0	cbz x22,0x009ad9a8
009ad9a4	ldr x8,[x22, #0x9a8]
009ad9a8	ldr x19,[x8, #0x28]
009ad9ac	tbnz w23,#0x0,0x009ad9b8
009ad9b0	mov x24,xzr
009ad9b4	b 0x009ad9bc
009ad9b8	ldr x24,[x27, #0x10]
009ad9bc	ldr x0,[x28]
009ad9c0	ldr x1,[x28, #0x440]
009ad9c4	bl 0x00c34fd0
009ad9c8	mov x20,x0
009ad9cc	cbz x0,0x009ada1c
009ad9d0	ldr x2,[x27]
009ad9d4	mov x0,x20
009ad9d8	mov x1,x19
009ad9dc	mov x3,x24
009ad9e0	bl 0x00c34fc0
009ad9e4	cbz w0,0x009ada54
009ad9e8	ldr w8,[x25, #0x1c]
009ad9ec	mov x0,x20
009ad9f0	and x1,x8,#0x30000
009ad9f4	bl 0x00c35010
009ad9f8	mov x0,x20
009ad9fc	bl 0x00c350c0
009ada00	tbz w23,#0x3,0x009adabc
009ada04	cmp w0,#0x0
009ada08	b.gt 0x009adabc
009ada0c	tbz w23,#0x4,0x009ada14
009ada10	bl 0x00c323e0
009ada14	mov w25,#0x2
009ada18	b 0x009adac8
009ada1c	bl 0x00c342a0
009ada20	adrp x0,0x2d5000
009ada24	adrp x2,0x2a7000
009ada28	add x0,x0,#0x6b3
009ada2c	add x2,x2,#0x9aa
009ada30	mov w1,#0x394
009ada34	bl 0x00c342b0
009ada38	mov w1,#0x100
009ada3c	mov w0,#0x14
009ada40	movk w1,#0xc, LSL #16
009ada44	b 0x009ada7c
009ada48	mov w21,wzr
009ada4c	mov x20,xzr
009ada50	b 0x009ada8c
009ada54	bl 0x00c342a0
009ada58	adrp x0,0x2d5000
009ada5c	adrp x2,0x2a7000
009ada60	add x0,x0,#0x6b3
009ada64	add x2,x2,#0x9aa
009ada68	mov w1,#0x398
009ada6c	bl 0x00c342b0
009ada70	mov w1,#0xb
009ada74	mov w0,#0x14
009ada78	movk w1,#0x8, LSL #16
009ada7c	mov x2,xzr
009ada80	bl 0x00c342c0
009ada84	mov w21,wzr
009ada88	cbz w26,0x009ada94
009ada8c	mov x0,x19
009ada90	bl 0x00c32c10
009ada94	mov x0,x20
009ada98	bl 0x00c34f70
009ada9c	mov w0,w21
009adaa0	ldp x29,x30,[sp, #0x50]
009adaa4	ldp x20,x19,[sp, #0x40]
009adaa8	ldp x22,x21,[sp, #0x30]
009adaac	ldp x24,x23,[sp, #0x20]
009adab0	ldp x26,x25,[sp, #0x10]
009adab4	ldp x28,x27,[sp], #0x60
009adab8	ret
009adabc	cmp w0,#0x0
009adac0	mov w25,wzr
009adac4	b.le 0x009adbe0
009adac8	mov x0,x20
009adacc	bl 0x00c34fa0
009adad0	mov x24,x0
009adad4	bl 0x00c34e00
009adad8	bl 0x00c31a90
009adadc	tbz w23,#0x1,0x009adb18
009adae0	mov x0,x24
009adae4	bl 0x00c325e0
009adae8	cmp w0,#0x1
009adaec	b.lt 0x009adb18
009adaf0	mov x0,x24
009adaf4	bl 0x00c325e0
009adaf8	sub w1,w0,#0x1
009adafc	mov x0,x24
009adb00	bl 0x00c32610
009adb04	bl 0x00c35090
009adb08	tbz w0,#0xd,0x009adb18
009adb0c	mov x0,x24
009adb10	bl 0x00c325f0
009adb14	bl 0x00c31a90
009adb18	mov x0,x24
009adb1c	bl 0x00c325e0
009adb20	cmp w0,#0x1
009adb24	b.lt 0x009adb70
009adb28	mov w23,wzr
009adb2c	mov x0,x24
009adb30	mov w1,w23
009adb34	bl 0x00c32610
009adb38	mov x2,x0
009adb3c	mov x0,x22
009adb40	mov x1,x21
009adb44	mov w3,wzr
009adb48	mov w4,wzr
009adb4c	bl 0x00c351a0
009adb50	cmp w0,#0x1
009adb54	b.ne 0x009adb94
009adb58	mov x0,x24
009adb5c	add w23,w23,#0x1
009adb60	bl 0x00c325e0
009adb64	cmp w23,w0
009adb68	b.lt 0x009adb2c
009adb6c	mov w25,#0x1
009adb70	adrp x1,0xcb4000
009adb74	ldr x0,[x27, #0x10]
009adb78	ldr x1,[x1, #0xd88]
009adb7c	bl 0x00c32600
009adb80	cmp w25,#0x0
009adb84	csinc w21,w25,wzr,ne
009adb88	str x24,[x27, #0x10]
009adb8c	cbnz w26,0x009ada8c
009adb90	b 0x009ada94
009adb94	mov w25,w0
009adb98	bl 0x00c342a0
009adb9c	adrp x0,0x2d5000
009adba0	adrp x2,0x2a7000
009adba4	add x0,x0,#0x6b3
009adba8	add x2,x2,#0x9aa
009adbac	mov w1,#0x3c4
009adbb0	bl 0x00c342b0
009adbb4	mov w0,#0x14
009adbb8	mov w1,w25
009adbbc	mov x2,xzr
009adbc0	bl 0x00c342c0
009adbc4	adrp x1,0xcb4000
009adbc8	ldr x1,[x1, #0xd88]
009adbcc	mov x0,x24
009adbd0	bl 0x00c32600
009adbd4	mov w21,wzr
009adbd8	cbnz w26,0x009ada8c
009adbdc	b 0x009ada94
009adbe0	mov x0,x20
009adbe4	bl 0x00c34fb0
009adbe8	mov w21,w0
009adbec	bl 0x00c342a0
009adbf0	adrp x0,0x2d5000
009adbf4	adrp x2,0x2a7000
009adbf8	add x0,x0,#0x6b3
009adbfc	add x2,x2,#0x9aa
009adc00	mov w1,#0x3aa
009adc04	bl 0x00c342b0
009adc08	sxtw x0,w21
009adc0c	bl 0x00c32d50
009adc10	adrp x2,0x2cd000
009adc14	mov x3,x0
009adc18	add x2,x2,#0x517
009adc1c	mov w0,#0x14
009adc20	mov w1,#0x86
009adc24	bl 0x00c342c0
009adc28	mov w21,wzr
009adc2c	cbnz w26,0x009ada8c
009adc30	b 0x009ada94
