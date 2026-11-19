; SRP_user_pwd_set0_sv @ 00ae7430
00ae7430	str x21,[sp, #-0x30]!
00ae7434	stp x20,x19,[sp, #0x10]
00ae7438	stp x29,x30,[sp, #0x20]
00ae743c	mov x20,x0
00ae7440	ldr x0,[x0, #0x8]
00ae7444	add x29,sp,#0x20
00ae7448	mov x19,x2
00ae744c	mov x21,x1
00ae7450	bl 0x00c36290
00ae7454	ldr x0,[x20, #0x10]
00ae7458	bl 0x00c322e0
00ae745c	cmp x21,#0x0
00ae7460	stp x21,x19,[x20, #0x8]
00ae7464	cset w8,ne
00ae7468	cmp x19,#0x0
00ae746c	ldp x29,x30,[sp, #0x20]
00ae7470	ldp x20,x19,[sp, #0x10]
00ae7474	cset w9,ne
00ae7478	and w0,w8,w9
00ae747c	ldr x21,[sp], #0x30
00ae7480	ret
