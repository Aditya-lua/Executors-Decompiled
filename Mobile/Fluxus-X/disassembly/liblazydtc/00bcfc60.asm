; FUN_00bcfc60 @ 00bcfc60
00bcfc60	paciasp
00bcfc64	sub sp,sp,#0x30
00bcfc68	stp x29,x30,[sp, #0x10]
00bcfc6c	stp x20,x19,[sp, #0x20]
00bcfc70	add x29,sp,#0x10
00bcfc74	mov x19,x0
00bcfc78	mov x20,x1
00bcfc7c	add x0,sp,#0x8
00bcfc80	mov x1,x19
00bcfc84	mov w2,wzr
00bcfc88	stur wzr,[x29, #-0x4]
00bcfc8c	bl 0x00c30140
00bcfc90	ldrb w8,[sp, #0x8]
00bcfc94	cmp w8,#0x1
00bcfc98	b.ne 0x00bcfd0c
00bcfc9c	ldr x8,[x19]
00bcfca0	ldur x9,[x8, #-0x18]
00bcfca4	mov x8,sp
00bcfca8	add x0,x19,x9
00bcfcac	bl 0x00c30070
00bcfcb0	adrp x1,0xcb4000
00bcfcb4	mov x0,sp
00bcfcb8	ldr x1,[x1, #0xf38]
00bcfcbc	bl 0x00c30080
00bcfcc0	ldr x8,[x19]
00bcfcc4	ldr x9,[x0]
00bcfcc8	ldur x8,[x8, #-0x18]
00bcfccc	add x3,x19,x8
00bcfcd0	ldr x8,[x9, #0x68]
00bcfcd4	ldr x1,[x3, #0x28]
00bcfcd8	sub x4,x29,#0x4
00bcfcdc	mov x2,xzr
00bcfce0	mov x5,x20
00bcfce4	blr x8
00bcfce8	mov x0,sp
00bcfcec	bl 0x00c30090
00bcfcf0	ldr x8,[x19]
00bcfcf4	ldur x8,[x8, #-0x18]
00bcfcf8	add x0,x19,x8
00bcfcfc	ldur w8,[x29, #-0x4]
00bcfd00	ldr w9,[x0, #0x20]
00bcfd04	orr w1,w9,w8
00bcfd08	bl 0x00c30130
00bcfd0c	mov x0,x19
00bcfd10	ldp x20,x19,[sp, #0x20]
00bcfd14	ldp x29,x30,[sp, #0x10]
00bcfd18	add sp,sp,#0x30
00bcfd1c	autiasp
00bcfd20	ret
