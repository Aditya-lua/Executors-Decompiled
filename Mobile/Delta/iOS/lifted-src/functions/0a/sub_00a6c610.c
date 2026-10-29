/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa6c610..0xa6cd14 (1796 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a6c610_0 {
    char padding_0[3728];
    long long field_e90;
} st_a6c610_0;

typedef struct st_a6c610_1 {
    char field_0;
} st_a6c610_1;

extern st_a6c610_0 g_f12000;
extern char g_f12e88;
extern long long g_f12e90;
extern unsigned long long g_f12e98;
extern char g_f12eb0;
extern unsigned long long g_f12eb8;
extern char g_f12ec0;
extern char g_f12ec8;
extern unsigned long long g_f12ed0;
extern st_a6c610_1 *g_f12ed8;
extern st_a6c610_1 *g_f12ee0;
extern unsigned long long g_f12ee8;

unsigned long long sub_a6c610(unsigned long long a0, unsigned long long a1, unsigned int a2)
{
    st_a6c610_0 *v5;  // x21
    unsigned long long v6;  // x8
    unsigned long long j;  // x24
    unsigned long long v16;  // x9
    unsigned long long v17;  // x12
    unsigned long long index;  // x12
    unsigned long long idx;  // x20
    unsigned long long v20;  // x23
    unsigned long long v21;  // x25
    unsigned long long v22;  // x1
    unsigned long long v23;  // x9
    unsigned long long v24;  // x10
    unsigned long long iter;  // x11
    unsigned long long v25;  // x8
    unsigned long long v26;  // x11
    unsigned long v27;  // cc_dep1
    unsigned long long v28;  // x8
    unsigned long long v29;  // 4110
    unsigned long long v30;  // 4102
    unsigned long long v31;  // 4110
    unsigned long long v32;  // 4102
    unsigned long long v33;  // x8
    unsigned long v34;  // x9
    unsigned long long node;  // x10
    unsigned long long v35;  // x9
    unsigned long long v36;  // x26
    unsigned long long v37;  // x8
    unsigned long long v38;  // x9
    unsigned long v39;  // x28
    unsigned long v40;  // x8
    unsigned long long v41;  // x8
    unsigned long long v42;  // 4118
    long long v43;  // x22
    unsigned long long v44;  // x8
    unsigned long long v9;  // x22
    unsigned long long v45;  // x9
    unsigned long v46;  // x8
    unsigned long long v47;  // x8
    unsigned long long v48;  // 4110
    unsigned long long v49;  // x12
    unsigned long long v50;  // x14
    unsigned long long v51;  // x13
    char *v52;  // x10
    unsigned long long v53;  // x14
    unsigned long v54;  // x15
    unsigned long long v10;  // x12
    unsigned long long v55;  // x11
    unsigned long long v56;  // x11
    unsigned long long v57;  // x9
    unsigned long long v58;  // x8
    unsigned long long v59;  // x12
    unsigned long v60;  // cc_dep1
    unsigned long long v61;  // x8
    unsigned long long v62;  // 4110
    unsigned long long v63;  // 4102
    unsigned long long v64;  // 4110
    unsigned long long v11;  // x27
    unsigned long long v65;  // 4102
    unsigned long long v66;  // x8
    unsigned long v67;  // x9
    unsigned long long v68;  // x10
    unsigned long long v69;  // x12
    unsigned long long v70;  // x8
    unsigned long long v71;  // x9
    unsigned long v72;  // cc_op
    unsigned long v73;  // cc_dep1
    unsigned long v74;  // cc_dep2
    unsigned long long i;  // x12
    unsigned long v75;  // cc_ndep
    unsigned long long v76;  // 4110
    unsigned long long v77;  // 4102
    unsigned long long v78;  // 4110
    unsigned long long v79;  // 4102
    unsigned long long v80;  // x0
    long long v81;  // x19
    unsigned long v82;  // x20
    unsigned long long v14;  // x1
    unsigned long long v0;  // [bp-0x78]
    unsigned long long v1;  // [bp-0x70]
    unsigned long long v2;  // [bp-0x68]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    if (g_f12e88 & 1)
    {
        v5 = &g_f12000.padding_0[0];
        if (sub_a7c198(g_f12e90))
        {
            v6 = g_f12eb8;
            if (g_f12eb8 >= a0)
            {
                iter = 0;
                node = 0;
                v9 = *(long long *)&g_f12ec8;
                v10 = g_f12ed0;
                v11 = *(long long *)&g_f12ec8 * 8;
                v2 = v11;
                do
                {
                    i = v10;
                    node += 1;
                    iter += 8;
                    v11 -= 8;
                    v10 = i * 2;
                } while (i < a0);
                v14 = *(long long *)&g_f12ec8 - node;
                if ((long long)(v14 + 1) >= 1)
                {
                    j = 0;
                    v16 = *(long long *)&g_f12ec0;
                    v17 = v14;
                    do
                    {
                        index = v17;
                        idx = *(long long *)(*(long long *)&g_f12ec0 + index * 8);
                        if (idx)
                        {
                            if (j)
                            {
                                v20 = -iter;
                                v21 = -node;
                                v0 = *(long long *)&g_f12ec8;
                                do
                                {
                                    v22 = v9 + v21;
                                    if (v22 >> 31 & 1 || (v23 = v22 & 0xffffffff, *(long long *)&g_f12ec8 <= (long long)v23))
                                        goto LABEL_a6cbf4;
                                    v24 = idx - *(long long *)&g_f12eb0;
                                    v25 = v6 >> ((char)v23 & 63);
                                    v26 = v25 - 1;
                                    v27 = v24 & v26;
                                    if (v24 & v26)
                                        goto LABEL_a6cc0c;
                                    v28 = v24 / v25 + (1 << ((char)v23 & 63));
                                    if (v28)
                                    {
                                        v29 = arm64g_calculate_condition(26, v27, 0, 0);
                                        v30 = arm64g_calculate_condition(36, (v29 & 1 ? v28 : 0x20000000), (v29 & 1 ? g_f12ee8 : 0), 0);
                                        if (v30 & 1)
                                            goto LABEL_a6cc24;
                                    }
                                    else
                                    {
                                        v31 = arm64g_calculate_condition(26, v27, 0, 0);
                                        v32 = arm64g_calculate_condition(32, (v31 & 1 ? 0 : 0x20000000), (v31 & 1 ? g_f12ee8 : 0), 0);
                                        if (v32 & 1)
                                            goto LABEL_a6cc24;
                                    }
                                    if ((char)(*(char *)&g_f12ee0[v28 >> 3]) >> ((char)v28 & 7 & 63) & 1)
                                        goto LABEL_a6cccc;
                                    sub_a6d768(idx);
                                    v33 = *(long long *)idx;
                                    v34 = *(long long *)(idx + 8);
                                    if (v33)
                                        *(unsigned long *)(v33 + 8) = v34;
                                    *(unsigned long long *)v34 = v33;
                                    if (*(long long *)idx && (v35 = *(long long *)(*(long long *)idx + 8), ((unsigned long long)*(long long *)(*(long long *)idx + 8) < (unsigned long long)*(long long *)&g_f12ec0 || (unsigned long long)*(long long *)(*(long long *)idx + 8) >= (unsigned long long)(*(long long *)&g_f12ec0 + *(long long *)&g_f12ec8 * 8)) && ((unsigned long long)*(long long *)(*(long long *)idx + 8) < (unsigned long long)*(long long *)&g_f12eb0 || *(long long *)&g_f12eb0 + g_f12eb8 <= (unsigned long long)*(long long *)(*(long long *)idx + 8))))
                                        goto LABEL_a6cbac;
                                    if (idx == *(long long *)(*(long long *)&g_f12ec0 + v2 + v21 * 8))
                                        goto LABEL_a6cc3c;
                                    v5 = v9 + v21 + 1;
                                    if (v5 >> 31 & 1 || (v36 = v5 & 0xffffffff, *(long long *)&g_f12ec8 <= (long long)v36))
                                        goto LABEL_a6cbf4;
                                    v1 = j;
                                    v37 = idx - *(long long *)&g_f12eb0;
                                    v38 = g_f12eb8 >> ((char)v36 & 63);
                                    if (v38 - 1 & v37)
                                        goto LABEL_a6cc0c;
                                    v39 = 1 << ((char)v36 & 63);
                                    v40 = v37 / v38;
                                    v41 = v40 + v39;
                                    v42 = arm64g_calculate_condition(2, v40, v39, 0);
                                    if (v42 & 1 || g_f12ee8 <= v41)
                                        goto LABEL_a6cc24;
                                    if ((char)(*(char *)&g_f12ee0[v41 >> 3]) >> ((char)v41 & 7 & 63) & 1)
                                        goto LABEL_a6ccb4;
                                    sub_a6d598(idx, v5, g_f12ed8);
                                    sub_a6d688(*(long long *)&g_f12ec0 + v2 + v20 + 8, idx);
                                    if (*(long long *)(*(long long *)&g_f12ec0 + v2 + v21 * 8 + 8) != idx)
                                        goto LABEL_a6cc9c;
                                    if (*(long long *)&g_f12ec8 <= (long long)v36)
                                        goto LABEL_a6cbf4;
                                    v43 = idx + (g_f12eb8 >> ((char)v5 & 63));
                                    v44 = v43 - *(long long *)&g_f12eb0;
                                    v45 = g_f12eb8 >> ((char)v36 & 63);
                                    if (v44 & v45 - 1)
                                        goto LABEL_a6cc0c;
                                    v46 = v44 / v45;
                                    v47 = v46 + v39;
                                    v48 = arm64g_calculate_condition(2, v46, v39, 0);
                                    if (v48 & 1 || g_f12ee8 <= v47)
                                        goto LABEL_a6cc24;
                                    if ((char)(*(char *)&g_f12ee0[v47 >> 3]) >> ((char)v47 & 7 & 63) & 1)
                                        goto LABEL_a6cc84;
                                    sub_a6d598(v43, v5, g_f12ed8);
                                    sub_a6d688(*(long long *)&g_f12ec0 + v2 + v20 + 8, v43);
                                    v16 = *(long long *)&g_f12ec0;
                                    idx = *(long long *)(*(long long *)&g_f12ec0 + v2 + v21 * 8 + 8);
                                    if (*(long long *)(*(long long *)&g_f12ec0 + v2 + v21 * 8 + 8) != v43)
                                        goto LABEL_a6cc6c;
                                    v6 = g_f12eb8;
                                    v49 = g_f12eb8 >> ((char)v36 & 63);
                                    v50 = (v43 - *(long long *)&g_f12eb0) / v49 + v39;
                                    v51 = v50 ^ 1;
                                    v52 = g_f12ed8;
                                    v53 = v50 >> 3;
                                    v54 = 1 << ((char)v51 & 7 & 63);
                                    if (!(v54 & *(char *)&g_f12ed8[v53]) || v54 & *(char *)&g_f12ee0[v53])
                                        v55 = 0;
                                    else
                                        v55 = *(long long *)&g_f12eb0 + v49 * (v51 & v39 - 1);
                                    if (v43 - (g_f12eb8 >> ((char)v5 & 63)) != v55)
                                        goto LABEL_a6cc54;
                                    v21 += 1;
                                    v20 += 8;
                                    j = v1 - 1;
                                    v9 = v0;
                                } while (j);
                                v9 = *(long long *)&g_f12ec8;
                            }
                            else
                            {
                                v52 = g_f12ed8;
                            }
                            v5 = &g_f12000.padding_0[0];
                            if (v14 >> 31 & 1 || (v56 = v14 & 0xffffffff, (long long)v9 <= (long long)v56))
                            {
LABEL_a6cbf4:
                                sub_a69928("assertion failed: list >= 0 && list < sh.freelist_size", "crypto/mem_sec.c", 359);
LABEL_a6cc0c:
                                sub_a69928("assertion failed: ((ptr - sh.arena) & ((sh.arena_size >> list) - 1)) == 0", "crypto/mem_sec.c", 360);
LABEL_a6cc24:
                                sub_a69928("assertion failed: bit > 0 && bit < sh.bittable_size", "crypto/mem_sec.c", 362);
LABEL_a6cc3c:
                                sub_a69928("assertion failed: temp != sh.freelist[slist]", "crypto/mem_sec.c", 657);
LABEL_a6cc54:
                                sub_a69928("assertion failed: temp - (sh.arena_size >> slist) == sh_find_my_buddy(temp, slist)", "crypto/mem_sec.c", 675);
LABEL_a6cc6c:
                                sub_a69928("assertion failed: sh.freelist[slist] == temp", "crypto/mem_sec.c", 673);
LABEL_a6cc84:
                                sub_a69928("assertion failed: !sh_testbit(temp, slist, sh.bitmalloc)", "crypto/mem_sec.c", 670);
LABEL_a6cc9c:
                                sub_a69928("assertion failed: sh.freelist[slist] == temp", "crypto/mem_sec.c", 666);
LABEL_a6ccb4:
                                sub_a69928("assertion failed: !sh_testbit(temp, slist, sh.bitmalloc)", "crypto/mem_sec.c", 663);
LABEL_a6cccc:
                                sub_a69928("assertion failed: !sh_testbit(temp, slist, sh.bitmalloc)", "crypto/mem_sec.c", 654);
                                sub_a69928("assertion failed: sh_testbit(chunk, list, sh.bittable)", "crypto/mem_sec.c", 680);
                                sub_a69928("assertion failed: WITHIN_ARENA(chunk)", "crypto/mem_sec.c", 684);
                            }
                            idx = *(long long *)(v16 + v11);
                            v57 = idx - *(long long *)&g_f12eb0;
                            v58 = v6 >> ((char)v56 & 63);
                            v59 = v58 - 1;
                            v60 = v57 & v59;
                            if (v57 & v59)
                                goto LABEL_a6cc0c;
                            v61 = v57 / v58 + (1 << ((char)v56 & 63));
                            if (v61)
                            {
                                v62 = arm64g_calculate_condition(26, v60, 0, 0);
                                v63 = arm64g_calculate_condition(36, (v62 & 1 ? v61 : 0x20000000), (v62 & 1 ? g_f12ee8 : 0), 0);
                                if (v63 & 1)
                                    goto LABEL_a6cc24;
                            }
                            else
                            {
                                v64 = arm64g_calculate_condition(26, v60, 0, 0);
                                v65 = arm64g_calculate_condition(32, (v64 & 1 ? 0 : 0x20000000), (v64 & 1 ? g_f12ee8 : 0), 0);
                                if (v65 & 1)
                                    goto LABEL_a6cc24;
                            }
                            if (!(v52[v61 >> 3] >> ((char)v61 & 7 & 63) & 1))
                            {
                                sub_a69928("assertion failed: sh_testbit(chunk, list, sh.bittable)", "crypto/mem_sec.c", 680);
                                sub_a69928("assertion failed: WITHIN_ARENA(chunk)", "crypto/mem_sec.c", 684);
                            }
                            sub_a6d598(idx);
                            v66 = *(long long *)idx;
                            v67 = *(long long *)(idx + 8);
                            if (v66)
                                *(unsigned long *)(v66 + 8) = v67;
                            *(unsigned long long *)v67 = v66;
                            if (!*(long long *)idx)
                                goto LABEL_a6cbc4;
                            v68 = *(long long *)(*(long long *)idx + 8);
                            v69 = *(long long *)&g_f12ec0 + *(long long *)&g_f12ec8 * 8;
                            v70 = *(long long *)&g_f12eb0;
                            v71 = g_f12eb8;
                            if ((unsigned long long)*(long long *)&g_f12ec0 <= v68)
                            {
                                v76 = arm64g_calculate_condition(v72 | 32, v73, v74, v75);
                                v77 = arm64g_calculate_condition(52, (v76 & 1 ? v68 : 0x20000000), (v76 & 1 ? v69 : 0), 0);
                                if (v77 & 1)
                                    goto LABEL_a6cbd0;
                            }
                            else
                            {
                                v78 = arm64g_calculate_condition(v72 | 32, v73, v74, v75);
                                v79 = arm64g_calculate_condition(48, (v78 & 1 ? v68 : 0x20000000), (v78 & 1 ? v69 : 0), 0);
                                if (v79 & 1)
                                    goto LABEL_a6cbd0;
                            }
                            if (v68 >= (unsigned long long)*(long long *)&g_f12eb0 && v68 < *(long long *)&g_f12eb0 + g_f12eb8)
                                goto LABEL_a6cbd0;
LABEL_a6cbac:
                            sub_a69928("assertion failed: WITHIN_FREELIST(temp2->p_next) || WITHIN_ARENA(temp2->p_next)", "crypto/mem_sec.c", 422);
LABEL_a6cbc4:
                            v70 = *(long long *)&g_f12eb0;
                            v71 = g_f12eb8;
LABEL_a6cbd0:
                            if (idx < v70)
                            {
                                sub_a69928("assertion failed: WITHIN_ARENA(chunk)", "crypto/mem_sec.c", 684);
                            }
                            else if (v70 + v71 > idx)
                            {
                                *(unsigned long long *)idx = 0;
                                *(unsigned long long *)(idx + 8) = 0;
                                v80 = sub_a6cd14(idx);
                                goto LABEL_a6c6f0;
                            }
                            else
                            {
                                sub_a69928("assertion failed: WITHIN_ARENA(chunk)", "crypto/mem_sec.c", 684);
                            }
                        }
                    } while ((j += 1, iter += 8, node += 1, v17 = index - 1, 0 < (long long)index));
                }
            }
            idx = 0;
            v80 = 0;
LABEL_a6c6f0:
            g_f12e98 = g_f12e98 + v80;
            sub_a7c1b4(v5->field_e90);
            if (idx)
                return idx;
            v81 = 111;
        }
        else
        {
            v81 = 524303;
        }
        v82 = a2;
        if (a1 || (unsigned int)v82)
        {
            sub_a368c8();
            sub_a369bc(a1, v82, 0);
            sub_a36abc(15, v81, 0);
        }
        return 0;
    }
}
