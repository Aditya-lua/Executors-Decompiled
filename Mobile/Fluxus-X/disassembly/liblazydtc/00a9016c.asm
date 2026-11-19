; CAST_encrypt @ 00a9016c
00a9016c	ldp w11,w14,[x1]
00a90170	ldp w12,w13,[x0]
00a90174	adrp x8,0xcb5000
00a90178	ldr x8,[x8, #0x468]
00a9017c	adrp x9,0xcb5000
00a90180	neg w14,w14
00a90184	ldr x9,[x9, #0x470]
00a90188	add w11,w11,w13
00a9018c	and w14,w14,#0x1f
00a90190	ror w14,w11,w14
00a90194	adrp x10,0xcb5000
00a90198	ubfx w11,w14,#0x8,#0x8
00a9019c	ldr x10,[x10, #0x478]
00a901a0	and w15,w14,#0xff
00a901a4	ldr w16,[x8, w11, UXTW #0x2]
00a901a8	adrp x11,0xcb5000
00a901ac	ldr w15,[x9, w15, UXTW #0x2]
00a901b0	ldr x11,[x11, #0x480]
00a901b4	lsr w17,w14,#0x18
00a901b8	ldr w17,[x10, w17, UXTW #0x2]
00a901bc	ubfx w14,w14,#0x10,#0x8
00a901c0	ldr w14,[x11, w14, UXTW #0x2]
00a901c4	eor w15,w15,w16
00a901c8	ldp w16,w18,[x1, #0x8]
00a901cc	sub w15,w15,w17
00a901d0	add w14,w15,w14
00a901d4	eor w12,w14,w12
00a901d8	neg w18,w18
00a901dc	and w18,w18,#0x1f
00a901e0	eor w14,w12,w16
00a901e4	ror w14,w14,w18
00a901e8	ubfx w15,w14,#0x8,#0x8
00a901ec	and w16,w14,#0xff
00a901f0	ldr w15,[x8, w15, UXTW #0x2]
00a901f4	ldr w16,[x9, w16, UXTW #0x2]
00a901f8	ldp w18,w17,[x1, #0x10]
00a901fc	sub w15,w15,w16
00a90200	lsr w16,w14,#0x18
00a90204	ldr w16,[x10, w16, UXTW #0x2]
00a90208	ubfx w14,w14,#0x10,#0x8
00a9020c	ldr w14,[x11, w14, UXTW #0x2]
00a90210	neg w17,w17
00a90214	add w15,w15,w16
00a90218	eor w13,w15,w13
00a9021c	eor w13,w13,w14
00a90220	and w17,w17,#0x1f
00a90224	sub w14,w18,w13
00a90228	ror w14,w14,w17
00a9022c	ubfx w15,w14,#0x8,#0x8
00a90230	and w16,w14,#0xff
00a90234	ldr w15,[x8, w15, UXTW #0x2]
00a90238	ldr w16,[x9, w16, UXTW #0x2]
00a9023c	ldp w17,w18,[x1, #0x18]
00a90240	add w15,w16,w15
00a90244	lsr w16,w14,#0x18
00a90248	ubfx w14,w14,#0x10,#0x8
00a9024c	ldr w16,[x10, w16, UXTW #0x2]
00a90250	ldr w14,[x11, w14, UXTW #0x2]
00a90254	neg w18,w18
00a90258	and w18,w18,#0x1f
00a9025c	eor w15,w15,w16
00a90260	sub w14,w15,w14
00a90264	eor w12,w14,w12
00a90268	add w14,w12,w17
00a9026c	ror w14,w14,w18
00a90270	ubfx w15,w14,#0x8,#0x8
00a90274	and w16,w14,#0xff
00a90278	ldr w15,[x8, w15, UXTW #0x2]
00a9027c	ldr w16,[x9, w16, UXTW #0x2]
00a90280	lsr w17,w14,#0x18
00a90284	ldr w17,[x10, w17, UXTW #0x2]
00a90288	ubfx w14,w14,#0x10,#0x8
00a9028c	ldr w14,[x11, w14, UXTW #0x2]
00a90290	eor w15,w16,w15
00a90294	ldp w16,w18,[x1, #0x20]
00a90298	sub w15,w15,w17
00a9029c	add w14,w15,w14
00a902a0	eor w13,w14,w13
00a902a4	neg w18,w18
00a902a8	and w18,w18,#0x1f
00a902ac	eor w14,w13,w16
00a902b0	ror w14,w14,w18
00a902b4	ubfx w15,w14,#0x8,#0x8
00a902b8	and w16,w14,#0xff
00a902bc	ldr w15,[x8, w15, UXTW #0x2]
00a902c0	ldr w16,[x9, w16, UXTW #0x2]
00a902c4	ldp w18,w17,[x1, #0x28]
00a902c8	sub w15,w15,w16
00a902cc	lsr w16,w14,#0x18
00a902d0	ldr w16,[x10, w16, UXTW #0x2]
00a902d4	ubfx w14,w14,#0x10,#0x8
00a902d8	ldr w14,[x11, w14, UXTW #0x2]
00a902dc	neg w17,w17
00a902e0	add w15,w15,w16
00a902e4	eor w12,w15,w12
00a902e8	eor w12,w12,w14
00a902ec	and w17,w17,#0x1f
00a902f0	sub w14,w18,w12
00a902f4	ror w14,w14,w17
00a902f8	ubfx w15,w14,#0x8,#0x8
00a902fc	and w16,w14,#0xff
00a90300	ldr w15,[x8, w15, UXTW #0x2]
00a90304	ldr w16,[x9, w16, UXTW #0x2]
00a90308	ldp w17,w18,[x1, #0x30]
00a9030c	add w15,w16,w15
00a90310	lsr w16,w14,#0x18
00a90314	ubfx w14,w14,#0x10,#0x8
00a90318	ldr w16,[x10, w16, UXTW #0x2]
00a9031c	ldr w14,[x11, w14, UXTW #0x2]
00a90320	neg w18,w18
00a90324	and w18,w18,#0x1f
00a90328	eor w15,w15,w16
00a9032c	sub w14,w15,w14
00a90330	eor w13,w14,w13
00a90334	add w14,w13,w17
00a90338	ror w14,w14,w18
00a9033c	ubfx w15,w14,#0x8,#0x8
00a90340	and w16,w14,#0xff
00a90344	ldr w15,[x8, w15, UXTW #0x2]
00a90348	ldr w16,[x9, w16, UXTW #0x2]
00a9034c	lsr w17,w14,#0x18
00a90350	ldr w17,[x10, w17, UXTW #0x2]
00a90354	ubfx w14,w14,#0x10,#0x8
00a90358	ldr w14,[x11, w14, UXTW #0x2]
00a9035c	eor w15,w16,w15
00a90360	ldp w16,w18,[x1, #0x38]
00a90364	sub w15,w15,w17
00a90368	add w14,w15,w14
00a9036c	eor w12,w14,w12
00a90370	neg w18,w18
00a90374	and w18,w18,#0x1f
00a90378	eor w14,w12,w16
00a9037c	ror w14,w14,w18
00a90380	ubfx w15,w14,#0x8,#0x8
00a90384	and w16,w14,#0xff
00a90388	ldr w15,[x8, w15, UXTW #0x2]
00a9038c	ldr w16,[x9, w16, UXTW #0x2]
00a90390	ldp w18,w17,[x1, #0x40]
00a90394	sub w15,w15,w16
00a90398	lsr w16,w14,#0x18
00a9039c	ldr w16,[x10, w16, UXTW #0x2]
00a903a0	ubfx w14,w14,#0x10,#0x8
00a903a4	ldr w14,[x11, w14, UXTW #0x2]
00a903a8	neg w17,w17
00a903ac	add w15,w15,w16
00a903b0	eor w13,w15,w13
00a903b4	eor w13,w13,w14
00a903b8	and w17,w17,#0x1f
00a903bc	sub w14,w18,w13
00a903c0	ror w14,w14,w17
00a903c4	ubfx w15,w14,#0x8,#0x8
00a903c8	and w16,w14,#0xff
00a903cc	ldr w15,[x8, w15, UXTW #0x2]
00a903d0	ldr w16,[x9, w16, UXTW #0x2]
00a903d4	ldp w17,w18,[x1, #0x48]
00a903d8	add w15,w16,w15
00a903dc	lsr w16,w14,#0x18
00a903e0	ubfx w14,w14,#0x10,#0x8
00a903e4	ldr w16,[x10, w16, UXTW #0x2]
00a903e8	ldr w14,[x11, w14, UXTW #0x2]
00a903ec	neg w18,w18
00a903f0	and w18,w18,#0x1f
00a903f4	eor w15,w15,w16
00a903f8	sub w14,w15,w14
00a903fc	eor w12,w14,w12
00a90400	add w14,w12,w17
00a90404	ror w14,w14,w18
00a90408	ubfx w15,w14,#0x8,#0x8
00a9040c	and w16,w14,#0xff
00a90410	ldr w15,[x8, w15, UXTW #0x2]
00a90414	ldr w16,[x9, w16, UXTW #0x2]
00a90418	lsr w17,w14,#0x18
00a9041c	ldr w17,[x10, w17, UXTW #0x2]
00a90420	ubfx w14,w14,#0x10,#0x8
00a90424	ldr w14,[x11, w14, UXTW #0x2]
00a90428	eor w15,w16,w15
00a9042c	ldp w16,w18,[x1, #0x50]
00a90430	sub w15,w15,w17
00a90434	add w14,w15,w14
00a90438	eor w13,w14,w13
00a9043c	neg w18,w18
00a90440	and w18,w18,#0x1f
00a90444	eor w14,w13,w16
00a90448	ror w14,w14,w18
00a9044c	ubfx w15,w14,#0x8,#0x8
00a90450	and w16,w14,#0xff
00a90454	ldr w15,[x8, w15, UXTW #0x2]
00a90458	ldr w16,[x9, w16, UXTW #0x2]
00a9045c	ldp w18,w17,[x1, #0x58]
00a90460	sub w15,w15,w16
00a90464	lsr w16,w14,#0x18
00a90468	ldr w16,[x10, w16, UXTW #0x2]
00a9046c	ubfx w14,w14,#0x10,#0x8
00a90470	ldr w14,[x11, w14, UXTW #0x2]
00a90474	neg w17,w17
00a90478	add w15,w15,w16
00a9047c	eor w12,w15,w12
00a90480	eor w12,w12,w14
00a90484	and w17,w17,#0x1f
00a90488	sub w14,w18,w12
00a9048c	ror w14,w14,w17
00a90490	ubfx w15,w14,#0x8,#0x8
00a90494	and w16,w14,#0xff
00a90498	lsr w17,w14,#0x18
00a9049c	ldr w15,[x8, w15, UXTW #0x2]
00a904a0	ldr w16,[x9, w16, UXTW #0x2]
00a904a4	ldr w17,[x10, w17, UXTW #0x2]
00a904a8	ubfx w14,w14,#0x10,#0x8
00a904ac	ldr w14,[x11, w14, UXTW #0x2]
00a904b0	ldr w18,[x1, #0x80]
00a904b4	add w15,w16,w15
00a904b8	eor w15,w15,w17
00a904bc	sub w14,w15,w14
00a904c0	eor w13,w14,w13
00a904c4	cbz w18,0x00a904d0
00a904c8	stp w13,w12,[x0]
00a904cc	ret
00a904d0	ldp w14,w15,[x1, #0x60]
00a904d4	ldp w17,w18,[x1, #0x68]
00a904d8	neg w15,w15
00a904dc	add w14,w14,w13
00a904e0	and w15,w15,#0x1f
00a904e4	ror w14,w14,w15
00a904e8	ubfx w15,w14,#0x8,#0x8
00a904ec	and w16,w14,#0xff
00a904f0	ldr w15,[x8, w15, UXTW #0x2]
00a904f4	ldr w16,[x9, w16, UXTW #0x2]
00a904f8	neg w18,w18
00a904fc	and w18,w18,#0x1f
00a90500	eor w15,w16,w15
00a90504	lsr w16,w14,#0x18
00a90508	ubfx w14,w14,#0x10,#0x8
00a9050c	ldr w16,[x10, w16, UXTW #0x2]
00a90510	ldr w14,[x11, w14, UXTW #0x2]
00a90514	sub w15,w15,w16
00a90518	add w14,w15,w14
00a9051c	eor w12,w14,w12
00a90520	eor w14,w12,w17
00a90524	ror w14,w14,w18
00a90528	ubfx w15,w14,#0x8,#0x8
00a9052c	and w16,w14,#0xff
00a90530	ldr w15,[x8, w15, UXTW #0x2]
00a90534	ldr w16,[x9, w16, UXTW #0x2]
00a90538	lsr w17,w14,#0x18
00a9053c	ldr w17,[x10, w17, UXTW #0x2]
00a90540	ubfx w14,w14,#0x10,#0x8
00a90544	sub w15,w15,w16
00a90548	ldp w16,w18,[x1, #0x70]
00a9054c	ldr w14,[x11, w14, UXTW #0x2]
00a90550	add w15,w15,w17
00a90554	eor w13,w15,w13
00a90558	neg w17,w18
00a9055c	eor w13,w13,w14
00a90560	and w17,w17,#0x1f
00a90564	sub w14,w16,w13
00a90568	ror w14,w14,w17
00a9056c	ubfx w15,w14,#0x8,#0x8
00a90570	and w16,w14,#0xff
00a90574	ldr w15,[x8, w15, UXTW #0x2]
00a90578	ldr w16,[x9, w16, UXTW #0x2]
00a9057c	ldp w17,w18,[x1, #0x78]
00a90580	add w15,w16,w15
00a90584	lsr w16,w14,#0x18
00a90588	ubfx w14,w14,#0x10,#0x8
00a9058c	ldr w16,[x10, w16, UXTW #0x2]
00a90590	ldr w14,[x11, w14, UXTW #0x2]
00a90594	neg w18,w18
00a90598	and w18,w18,#0x1f
00a9059c	eor w15,w15,w16
00a905a0	sub w14,w15,w14
00a905a4	eor w12,w14,w12
00a905a8	add w14,w12,w17
00a905ac	ror w14,w14,w18
00a905b0	ubfx w15,w14,#0x8,#0x8
00a905b4	and w16,w14,#0xff
00a905b8	lsr w17,w14,#0x18
00a905bc	ldr w8,[x8, w15, UXTW #0x2]
00a905c0	ldr w9,[x9, w16, UXTW #0x2]
00a905c4	ldr w10,[x10, w17, UXTW #0x2]
00a905c8	ubfx w14,w14,#0x10,#0x8
00a905cc	ldr w11,[x11, w14, UXTW #0x2]
00a905d0	eor w8,w9,w8
00a905d4	sub w8,w8,w10
00a905d8	add w8,w8,w11
00a905dc	eor w13,w8,w13
00a905e0	stp w13,w12,[x0]
00a905e4	ret
