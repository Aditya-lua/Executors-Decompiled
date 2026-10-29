/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa6cf8c..0xa6d4c0 (1332 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a6cf8c_0 {
    char field_0;
} st_a6cf8c_0;

extern unsigned long long g_f12eb0;
extern unsigned long long g_f12eb8;
extern char g_f12ec0;
extern unsigned long long g_f12ec8;
extern unsigned long long g_f12ed0;
extern st_a6cf8c_0 *g_f12ed8;
extern st_a6cf8c_0 *g_f12ee0;
extern char g_f12ee8;

unsigned long long sub_a6cf8c(unsigned long long a0)
{
    unsigned long long v2;  // x8
    unsigned long v3;  // cc_op
    unsigned long v6;  // cc_ndep
    unsigned long long v7;  // 4110
    unsigned long long v8;  // 4102
    unsigned long v9;  // cc_dep1
    unsigned long v10;  // cc_dep2
    unsigned long long v11;  // x19
    unsigned long long v12;  // x12
    unsigned long v13;  // x20
    unsigned long long v14;  // x13
    unsigned long long v15;  // x12
    unsigned long long v16;  // x12
    unsigned long long v17;  // x9
    unsigned long long v18;  // x10
    unsigned long long v19;  // x11
    unsigned long v20;  // cc_dep1
    unsigned long long v21;  // x9
    unsigned long long v22;  // 4110
    unsigned long long v23;  // 4102
    unsigned long long v24;  // 4110
    unsigned long long v25;  // 4102
    unsigned long long v26;  // x21
    unsigned long long v27;  // x0
    unsigned long v28;  // x25
    unsigned long long v29;  // x26
    unsigned long v30;  // x25
    unsigned long long v31;  // x23
    unsigned long v32;  // x24
    unsigned long long v33;  // x9
    unsigned long long v34;  // x10
    unsigned long long v35;  // x8
    unsigned long long v36;  // x13
    unsigned long long v37;  // x11
    unsigned long v38;  // x14
    unsigned long v39;  // x11
    unsigned long v40;  // x14
    unsigned long long v41;  // x28
    unsigned long long v42;  // x15
    unsigned long long v43;  // x13
    unsigned long long v4;  // 4110
    unsigned long long v44;  // x15
    unsigned long v45;  // x16
    unsigned long long v46;  // x12
    unsigned long long v47;  // x8
    unsigned long v48;  // x9
    unsigned long long v49;  // x9
    unsigned long long v50;  // x8
    unsigned long long v51;  // x9
    unsigned long v52;  // x8
    unsigned long long v53;  // x8
    unsigned long long v5;  // 4102
    unsigned long long v54;  // 4110
    unsigned long long v55;  // x21
    unsigned long long v56;  // x8
    unsigned long v57;  // x9
    unsigned long long v58;  // x9
    unsigned long long v59;  // x9
    unsigned long long v60;  // 4111
    unsigned long v61;  // x20
    unsigned long long v62;  // 4113
    unsigned long long v63;  // x9
    unsigned long long v64;  // x8
    unsigned long long v65;  // x10
    unsigned long v66;  // x9
    unsigned long v67;  // x8
    unsigned long long v68;  // x8
    unsigned long long v69;  // 4117
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = g_f12eb0 + g_f12eb8;
    if (g_f12eb0 <= a0)
    {
        v4 = arm64g_calculate_condition(v3 | 144, v9, v10, v6);
        v5 = arm64g_calculate_condition(148, (v4 & 1 ? v2 : 0), (v4 & 1 ? a0 : 0), 0);
        if (!(v5 & 1))
            goto LABEL_a6cfc4;
    }
    else
    {
        v7 = arm64g_calculate_condition(v3 | 144, v9, v10, v6);
        v8 = arm64g_calculate_condition(144, (v7 & 1 ? v2 : 0), (v7 & 1 ? a0 : 0), 0);
        if (!(v8 & 1))
        {
LABEL_a6cfc4:
            v11 = a0;
            v12 = a0 + g_f12eb8 - g_f12eb0;
            v13 = g_f12ec8 - 1;
            if (v12 >= g_f12ed0)
            {
                v14 = v12 / g_f12ed0;
                while (1)
                {
                    v15 = v14;
                    if ((char)(*(char *)&g_f12ed8[v14 >> 3]) >> ((char)v15 & 7 & 63) & 1)
                        break;
                    if (v15 & 1)
                        goto LABEL_a6d460;
                    v14 = v15 >> 1;
                    v13 -= 1;
                    if (!v15)
                        break;
                }
            }
            if (!(v13 >> 31 & 1) && !(v16 = v13 & 0xffffffff, (long long)g_f12ec8 <= (long long)v16))
            {
                v17 = v11 - g_f12eb0;
                v18 = g_f12eb8 >> ((char)v16 & 63);
                v19 = v18 - 1;
                v20 = v19 & v17;
                if (v19 & v17)
                {
LABEL_a6d3d0:
                    sub_a69928("assertion failed: ((ptr - sh.arena) & ((sh.arena_size >> list) - 1)) == 0", "crypto/mem_sec.c", 360);
                    goto LABEL_a6d3e8;
                }
                v21 = v17 / v18 + (1 << ((char)v16 & 63));
                if (v21)
                {
                    v22 = arm64g_calculate_condition(26, v20, 0, 0);
                    v23 = arm64g_calculate_condition(36, (v22 & 1 ? v21 : 0x20000000), (v22 & 1 ? *(long long *)&g_f12ee8 : 0), 0);
                    if (!(v23 & 1))
                        goto LABEL_a6d060;
                }
                else
                {
                    v24 = arm64g_calculate_condition(26, v20, 0, 0);
                    v25 = arm64g_calculate_condition(32, (v24 & 1 ? 0 : 0x20000000), (v24 & 1 ? *(long long *)&g_f12ee8 : 0), 0);
                    if (!(v25 & 1))
                    {
LABEL_a6d060:
                        if (!((char)(*(char *)&g_f12ed8[v21 >> 3]) >> ((char)v21 & 7 & 63) & 1))
                            sub_a69928("assertion failed: sh_testbit(ptr, list, sh.bittable)", "crypto/mem_sec.c", 704);
                        sub_a6d768(v11, v13, g_f12ee0);
                        v26 = v13 * 8;
                        v27 = sub_a6d688(*(long long *)&g_f12ec0 + v26, v11);
                        v28 = v13 - 1;
                        v29 = v26 - 8;
                        while (1)
                        {
                            v30 = v28;
                            v31 = (unsigned int)v30 + 1;
                            v32 = 1 << ((char)v31 & 63);
                            v33 = v11 - g_f12eb0;
                            v34 = g_f12eb8 >> ((char)v31 & 63);
                            v35 = v33 / v34 + v32;
                            v36 = v35 ^ 1;
                            v37 = v35 >> 3;
                            v38 = 1 << ((char)v36 & 7 & 63);
                            if (!(v38 & *(char *)&g_f12ed8[v37]))
                                return v27;
                            v39 = *(char *)&g_f12ee0[v37];
                            if (v38 & v39)
                                return v27;
                            if (!g_f12eb0)
                                return v27;
                            v40 = v32 - 1;
                            v41 = v34 * (v36 & v40);
                            v42 = v41 / v34 + v32;
                            v43 = v42 ^ 1;
                            v44 = v42 >> 3;
                            v45 = 1 << ((char)v43 & 7 & 63);
                            if (v45 & *(char *)&g_f12ed8[v44])
                            {
                                v46 = g_f12eb0 + v34 * (v43 & v40);
                                if (v45 & *(char *)&g_f12ee0[v44])
                                    v46 = 0;
                                if (v11 == v46)
                                    goto LABEL_a6d15c;
                                else
                                    goto LABEL_a6d418;
                            }
                            else
                            {
                                if (v11)
                                    goto LABEL_a6d418;
                                else
                                    goto LABEL_a6d15c;
                            }
LABEL_a6d15c:
                            if ((long long)g_f12ec8 <= (long long)v31)
                                goto LABEL_a6d3e8;
                            if (v34 - 1 & v33)
                                goto LABEL_a6d3d0;
                            if (!v35 || (unsigned long long)*(long long *)&g_f12ee8 <= v35)
                                break;
                            if (v39 >> ((char)v35 & 7 & 63) & 1)
                                goto LABEL_a6d430;
                            sub_a6d768(v11, v13);
                            v47 = *(long long *)v11;
                            v48 = *(long long *)(v11 + 8);
                            if (v47)
                                *(unsigned long *)(v47 + 8) = v48;
                            *(unsigned long long *)v48 = v47;
                            if (*(long long *)v11 && (v49 = *(long long *)(*(long long *)v11 + 8), (v49 < (unsigned long long)*(long long *)&g_f12ec0 || v49 >= *(long long *)&g_f12ec0 + g_f12ec8 * 8) && (v49 < g_f12eb0 || g_f12eb0 + g_f12eb8 <= v49)))
                                goto LABEL_a6d478;
                            if ((long long)g_f12ec8 <= (long long)v31)
                                goto LABEL_a6d3e8;
                            v50 = v11 - g_f12eb0;
                            v51 = g_f12eb8 >> ((char)v31 & 63);
                            if (v51 - 1 & v50)
                                goto LABEL_a6d3d0;
                            v52 = v50 / v51;
                            v53 = v52 + v32;
                            v54 = arm64g_calculate_condition(2, v52, v32, 0);
                            if (v54 & 1 || (unsigned long long)*(long long *)&g_f12ee8 <= v53)
                                break;
                            if ((char)(*(char *)&g_f12ee0[v53 >> 3]) >> ((char)v53 & 7 & 63) & 1)
                                goto LABEL_a6d448;
                            v55 = g_f12eb0 + v41;
                            sub_a6d768(v55, v13, g_f12ed8);
                            v56 = *(long long *)v55;
                            v57 = *(long long *)(v55 + 8);
                            if (v56)
                                *(unsigned long *)(v56 + 8) = v57;
                            *(unsigned long long *)v57 = v56;
                            if (*(long long *)v55 && (v58 = *(long long *)(*(long long *)v55 + 8), (v58 < (unsigned long long)*(long long *)&g_f12ec0 || v58 >= *(long long *)&g_f12ec0 + g_f12ec8 * 8) && (v58 < g_f12eb0 || g_f12eb0 + g_f12eb8 <= v58)))
                                goto LABEL_a6d478;
                            if (v55 < v11)
                                v59 = v11;
                            else
                                v59 = v55;
                            *(unsigned long long *)v59 = 0;
                            *(unsigned long long *)(v59 + 8) = 0;
                            v60 = arm64g_calculate_condition(132, v11, v55, 0);
                            if (v60 & 1)
                                v11 = v55;
                            v61 = (unsigned int)v13 - 1;
                            v62 = arm64g_calculate_condition(67, v13 & 0xffffffff, 1, 0);
                            if (v62 & 1 || (v63 = v30 & 0xffffffff, (long long)g_f12ec8 <= (long long)v63))
                                goto LABEL_a6d3e8;
                            v64 = v11 - g_f12eb0;
                            v65 = g_f12eb8 >> ((char)v63 & 63);
                            if (v65 - 1 & v64)
                                goto LABEL_a6d3d0;
                            v66 = 1 << ((char)v63 & 63);
                            v67 = v64 / v65;
                            v68 = v67 + v66;
                            v69 = arm64g_calculate_condition(2, v67, v66, 0);
                            if (v69 & 1 || (unsigned long long)*(long long *)&g_f12ee8 <= v68)
                                break;
                            if ((char)(*(char *)&g_f12ee0[v68 >> 3]) >> ((char)v68 & 7 & 63) & 1)
                                goto LABEL_a6d400;
                            sub_a6d598(v11, v61, g_f12ed8);
                            v27 = sub_a6d688(*(long long *)&g_f12ec0 + v29, v11);
                            v28 = v30 - 1;
                            v29 -= 8;
                            v13 = v61;
                            if (*(long long *)(*(long long *)&g_f12ec0 + v30 * 8) != v11)
                                return sub_a69928("assertion failed: sh.freelist[list] == ptr", "crypto/mem_sec.c", 729);
                        }
                    }
                }
                sub_a69928("assertion failed: bit > 0 && bit < sh.bittable_size", "crypto/mem_sec.c", 362);
                goto LABEL_a6d3d0;
            }
            else
            {
LABEL_a6d3e8:
                sub_a69928("assertion failed: list >= 0 && list < sh.freelist_size", "crypto/mem_sec.c", 359);
LABEL_a6d400:
                sub_a69928("assertion failed: !sh_testbit(ptr, list, sh.bitmalloc)", "crypto/mem_sec.c", 726);
LABEL_a6d418:
                sub_a69928("assertion failed: ptr == sh_find_my_buddy(buddy, list)", "crypto/mem_sec.c", 710);
LABEL_a6d430:
                sub_a69928("assertion failed: !sh_testbit(ptr, list, sh.bitmalloc)", "crypto/mem_sec.c", 712);
LABEL_a6d448:
                sub_a69928("assertion failed: !sh_testbit(ptr, list, sh.bitmalloc)", "crypto/mem_sec.c", 715);
LABEL_a6d460:
                sub_a69928("assertion failed: (bit & 1) == 0", "crypto/mem_sec.c", 349);
LABEL_a6d478:
                sub_a69928("assertion failed: WITHIN_FREELIST(temp2->p_next) || WITHIN_ARENA(temp2->p_next)", "crypto/mem_sec.c", 422);
            }
        }
    }
    sub_a69928("assertion failed: WITHIN_ARENA(ptr)", "crypto/mem_sec.c", 699);
    sub_a69928("assertion failed: sh_testbit(ptr, list, sh.bittable)", "crypto/mem_sec.c", 704);
}
