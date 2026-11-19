; FUN_00807b44 @ 00807b44
00807b44	stp x29,x30,[sp, #-0x30]!
00807b48	stp x22,x21,[sp, #0x10]
00807b4c	stp x20,x19,[sp, #0x20]
00807b50	mov x29,sp
00807b54	mov w1,#0x1
00807b58	mov w2,#0x8
00807b5c	mov x19,x0
00807b60	bl 0x008af088
00807b64	mov x0,x19
00807b68	mov w1,#0x1
00807b6c	bl 0x008abd78
00807b70	adrp x22,0xd1b000
00807b74	mov x21,x0
00807b78	ldr x20,[x0]
00807b7c	ldr x1,[x22, #0x360]
00807b80	mov x0,x19
00807b84	mov w2,wzr
00807b88	bl 0x008aca84
00807b8c	mov x0,x19
00807b90	mov w1,#0xffffd8f0
00807b94	bl 0x008acdb8
00807b98	mov x0,x19
00807b9c	mov x1,x20
00807ba0	mov w2,wzr
00807ba4	bl 0x008aca84
00807ba8	mov x0,x19
00807bac	mov w1,#0xfffffffe
00807bb0	bl 0x008acdb8
00807bb4	mov x0,x19
00807bb8	mov x1,x20
00807bbc	mov w2,wzr
00807bc0	bl 0x008aca84
00807bc4	mov x0,x19
00807bc8	bl 0x008ac024
00807bcc	mov x0,x19
00807bd0	mov w1,#0xfffffffc
00807bd4	bl 0x008ad954
00807bd8	ldr x8,[x22, #0x360]
00807bdc	mov x0,x19
00807be0	mov x1,x21
00807be4	blr x8
00807be8	mov x0,x19
00807bec	mov w1,#0x1
00807bf0	bl 0x008ad4b0
00807bf4	mov x0,x19
00807bf8	mov w1,#0xfffffffe
00807bfc	bl 0x008adbdc
00807c00	mov x0,x19
00807c04	mov x1,x20
00807c08	mov w2,wzr
00807c0c	bl 0x008aca84
00807c10	mov x0,x19
00807c14	mov w1,#0xfffffffe
00807c18	bl 0x008aaf04
00807c1c	mov x0,x19
00807c20	mov w1,#0xfffffffb
00807c24	bl 0x008ad954
00807c28	mov w0,#0x1
00807c2c	ldp x20,x19,[sp, #0x20]
00807c30	ldp x22,x21,[sp, #0x10]
00807c34	ldp x29,x30,[sp], #0x30
00807c38	ret
