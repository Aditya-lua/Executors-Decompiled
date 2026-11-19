; PKCS8_decrypt_ex @ 00abc34c
00abc34c	sub sp,sp,#0x50
00abc350	stp x22,x21,[sp, #0x20]
00abc354	mov w21,w2
00abc358	mov x22,x1
00abc35c	add x1,sp,#0x18
00abc360	add x2,sp,#0x8
00abc364	str x23,[sp, #0x10]
00abc368	stp x20,x19,[sp, #0x30]
00abc36c	stp x29,x30,[sp, #0x40]
00abc370	add x29,sp,#0x40
00abc374	mov x19,x4
00abc378	mov x20,x3
00abc37c	bl 0x00c38300
00abc380	ldr x23,[sp, #0x18]
00abc384	bl 0x00c37e80
00abc388	ldr x4,[sp, #0x8]
00abc38c	mov x1,x0
00abc390	mov w5,#0x1
00abc394	mov x0,x23
00abc398	mov x2,x22
00abc39c	mov w3,w21
00abc3a0	mov x6,x20
00abc3a4	mov x7,x19
00abc3a8	bl 0x00c3f480
00abc3ac	ldp x29,x30,[sp, #0x40]
00abc3b0	ldp x20,x19,[sp, #0x30]
00abc3b4	ldp x22,x21,[sp, #0x20]
00abc3b8	ldr x23,[sp, #0x10]
00abc3bc	add sp,sp,#0x50
00abc3c0	ret
