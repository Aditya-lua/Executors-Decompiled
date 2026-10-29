/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x973154..0x973994 (2112 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_973154_0 {
    char padding_0[96];
    unsigned long long field_60;
} st_973154_0;

extern char _NSHomeDirectory;

unsigned long long sub_973154(st_973154_0 *a0, void* a1)
{
    unsigned long long v15;  // x28
    unsigned long long v16;  // x27
    unsigned long long v25;  // x30
    void* v26;  // x20
    unsigned long long v27;  // x25
    unsigned long long v28;  // x9
    void* v29;  // x10
    unsigned long long v30;  // x23
    void* v31;  // x24
    unsigned long long v32;  // w8
    unsigned long long v33;  // 4167
    unsigned long long v34;  // x19
    unsigned long long v17;  // x26
    unsigned long long v35;  // x27
    unsigned long long v36;  // w10
    unsigned long v38;  // x27
    unsigned int v39;  // w22
    unsigned long long v40;  // x21
    unsigned long long v41;  // w0
    unsigned long v42;  // x21
    void* v44;  // x13
    unsigned long long v18;  // x25
    void* iter;  // x28
    void* v46;  // x8
    unsigned long long v47;  // x22
    unsigned long long v48;  // x26
    unsigned long v49;  // x21
    void* v50;  // x10
    unsigned long long v51;  // x21
    void* v52;  // x24
    void* node;  // x27
    unsigned long long v54;  // x24
    unsigned long long v19;  // x24
    unsigned long v55;  // x20
    unsigned long long v56;  // x8
    unsigned long long v57;  // 4161
    unsigned long v58;  // x8
    unsigned long long v59;  // 4192
    unsigned long long v60;  // 4201
    unsigned long long v61;  // x8
    unsigned long long v62;  // 4161
    unsigned long v63;  // x8
    unsigned long long v64;  // 4189
    unsigned long long v20;  // x23
    unsigned long long v65;  // 4194
    unsigned long long v66;  // x8
    unsigned long long v67;  // 4161
    unsigned long v68;  // x8
    unsigned long long v69;  // 4192
    unsigned long long v70;  // 4201
    unsigned long long v71;  // x8
    unsigned long long v72;  // 4165
    unsigned long v73;  // x8
    unsigned long long v74;  // 4159
    unsigned long long v21;  // x22
    unsigned long long v75;  // x8
    unsigned long long v76;  // 4165
    unsigned long v77;  // x8
    unsigned long long v78;  // 4159
    unsigned long long v79;  // x8
    unsigned long long v80;  // 4165
    unsigned long v81;  // x8
    unsigned long long v82;  // 4159
    unsigned long v83;  // x8
    unsigned long long v84;  // 4163
    unsigned long long v22;  // x21
    unsigned long long v23;  // x20
    unsigned long long v24;  // x19
    unsigned long v0;  // [bp-0x70]
    unsigned long long v1;  // [bp-0x64]
    unsigned long long v2;  // [bp-0x60]
    unsigned long long v3;  // [bp-0x58]
    unsigned long long v4;  // [bp-0x50]
    unsigned long long v5;  // [bp-0x48]
    unsigned long long v6;  // [bp-0x40]
    unsigned long long v7;  // [bp-0x38]
    unsigned long long v8;  // [bp-0x30]
    unsigned long long v9;  // [bp-0x28]
    unsigned long long v10;  // [bp-0x20]
    unsigned long long v11;  // [bp-0x18]
    char *v12;  // [bp-0x10]
    unsigned long long v13;  // [bp-0x8]
    char v14;  // [bp+0x0]

    if (!a1)
        return 0;
    v2 = v15;
    v3 = v16;
    v4 = v17;
    v5 = v18;
    v6 = v19;
    v7 = v20;
    v8 = v21;
    v9 = v22;
    v10 = v23;
    v11 = v24;
    v12 = &v14;
    v13 = v25;
    v26 = a1;
    v0 = a0->field_60;
    v27 = v26 + _strlen(a1);
    while (1)
    {
        v28 = 0;
        v29 = v26 - 1;
        do
        {
            v30 = v28;
            v31 = v29;
            v32 = *((char *)v26 + v28);
            v33 = arm64g_calculate_condition((v32 <= 32 ? 4 : 0), (v32 <= 32 ? 1 << ((char)v32 & 63) & 0x100002600 : 0x40000000), 0, 0);
        } while (!(v33 & 1) && (v28 = v30 + 1, v29 = v31 + 1, v26 + v28 - 1 < v27));
        v34 = v26 + v30;
        if (v34 == v27)
        {
            a0->field_60 = v0;
            return 1;
        }
        v35 = 0;
        v36 = v32;
        while (1)
        {
            if (32 >= (v36 & 0xff) && 1 << ((char)v36 & 63) & 0x100002400 || (v36 & 0xff) == 9 || v27 <= v34 + v35)
                break;
            v38 = v35 + 1;
            v36 = *(char *)(v34 + v35 + 1);
            v31 += 1;
            v35 = v38;
        }
        if (!v35)
        {
            v32 = 0xff;
            v39 = 0xff000000;
        }
        else if (v32 == 45 || v32 == 43)
        {
            v1 = v32 == 43;
            v34 = v26 + v30 + 1;
            if (v35 == 1)
                v40 = 0xffffffff;
            else
                v40 = *(char *)v34;
            if (!sub_a6994c(v40, 3) && !(v41 = (unsigned int)sub_a69974(v40), (unsigned int)v40 == 95 || sub_a69974(v40) || (unsigned int)v40 == 45 || (char)v40 == 42))
                break;
            else
                goto LABEL_973318;
            goto LABEL_973318;
        }
        else
        {
            v39 = (char)v32 * &_NSHomeDirectory;
        }
        v42 = (char)v32;
        if (sub_a6994c(v42, 3))
        {
            v1 = 1;
        }
        else
        {
            v1 = 1;
            if ((unsigned int)v42 != 95 && !sub_a69974(v42) && !(v1 = 1, v39 == 0x2a000000 || (unsigned int)v42 == 45))
                break;
        }
LABEL_973318:
        v44 = v26 + v30 + v35;
        if (v26 - v34 + v30 + v35 == 1 && *(char *)v34 == 42)
        {
            v0 = (v1 ? 254 : 0) | v0 & 0xffffffffffffff01;
            v26 = v44;
            continue;
        }
        iter = v34;
        if (v44 > iter)
        {
            v46 = v26 + v30 + v35;
            iter = v34;
            while (*(char *)iter != 58)
            {
                if (iter + 1 == v44)
                {
                    iter = v46;
                    break;
                }
            }
        }
        if (v44 == iter)
            break;
        v47 = iter - v34;
        if (v47 != 1)
        {
            if (!v47)
                break;
            else
                goto LABEL_9733a8;
            goto LABEL_9733a8;
        }
        if (*(char *)v34 != 42)
        {
LABEL_9733a8:
            v48 = 0;
            while (1)
            {
                v49 = *(char *)(v34 + v48);
                if (!sub_a6994c(v49, 3) && !sub_a69974(v49) && (unsigned int)v49 != 95 && (char)v49 != 45)
                    break;
                v48 += 1;
                if (v47 == v48)
                    goto LABEL_973400;
            }
        }
        v34 = 0;
        v47 = 0;
LABEL_973400:
        v50 = iter + 1;
        v51 = v26 - iter + v30 + v35 - 1;
        if (v51 != 1)
        {
            if (!v51)
                break;
            else
                goto LABEL_97343c;
            goto LABEL_97343c;
        }
        if (*(char *)v50 != 42)
        {
LABEL_97343c:
            v52 = -iter + v31;
            node = v50;
            while (1)
            {
                v54 = v52;
                v55 = *(char *)node;
                node += 1;
                if (!sub_a6994c(v55, 3) && !sub_a69974(v55) && (unsigned int)v55 != 95 && (char)v55 != 45)
                    break;
                v52 = v54 - 1;
                if (v54 == 1)
                    goto LABEL_97349c;
            }
        }
        v50 = 0;
        v51 = 0;
LABEL_97349c:
        v26 = v44;
        if (!v34 || v47 == 12)
        {
            if (!v50 || v51 == 18)
            {
                if (v34 && !(v56 = *(long long *)v34, v57 = arm64g_calculate_condition((v56 == 7598807758576447331 ? 4 : 0), (v56 == 7598807758576447331 ? *(int *)(v34 + 8) : 0), (v56 == 7598807758576447331 ? 2037672310 : 0), 0), v57 & 1))
                {
                    if (!v50 || v51 == 24)
                        goto LABEL_9735ac;
                    goto LABEL_973644;
                }
                else if (!v50 || (v58 = *(long long *)v50, v59 = arm64g_calculate_condition((v58 == 7598807758576447331 ? 4 : 0), (v58 == 7598807758576447331 ? (long long)v50[8] : 0), (v58 == 7598807758576447331 ? 8390876208524389999 : 0), 0), v60 = arm64g_calculate_condition((v59 & 1 ? 3 : 0) | 16, (v59 & 1 ? (short)v50[16] : 0), (v59 & 1 ? 25701 : 0), 0), !(v60 & 1)))
                {
                    v0 = v0 & 0xfffffffffffffffd | (v1 ? 2 : 0);
                }
            }
            if (!v50 || v51 == 24)
            {
                if (!v34)
                    goto LABEL_9735d8;
LABEL_9735ac:
                v61 = *(long long *)v34;
                v62 = arm64g_calculate_condition((v61 == 7598807758576447331 ? 4 : 0) | 16, (v61 == 7598807758576447331 ? *(int *)(v34 + 8) : 0), (v61 == 7598807758576447331 ? 2037672310 : 0), 0);
                if (!(v62 & 1))
                {
LABEL_9735d8:
                    if (!v50 || (v63 = *(long long *)v50, v64 = arm64g_calculate_condition((v63 == 7598807758576447331 ? 4 : 0), (v63 == 7598807758576447331 ? (long long)v50[8] : 0), (v63 == 7598807758576447331 ? 7310575247908892271 : 0), 0), v65 = arm64g_calculate_condition((v64 & 1 ? 4 : 0) | 16, (v64 & 1 ? (long long)v50[16] : 0), (v64 & 1 ? 7234316338086311263 : 0), 0), !(v65 & 1)))
                        v0 = v0 & 0xfffffffffffffffb | (v1 ? 4 : 0);
                }
            }
LABEL_973644:
            if ((!v50 || v51 == 0x11) && (!v34 || (v66 = *(long long *)v34, v67 = arm64g_calculate_condition((v66 == 7598807758576447331 ? 4 : 0) | 16, (v66 == 7598807758576447331 ? *(int *)(v34 + 8) : 0), (v66 == 7598807758576447331 ? 2037672310 : 0), 0), !(v67 & 1))) && (!v50 || (v68 = *(long long *)v50, v69 = arm64g_calculate_condition((v68 == 7598807758576447331 ? 4 : 0), (v68 == 7598807758576447331 ? (long long)v50[8] : 0), (v68 == 7598807758576447331 ? 7310309131466796655 : 0), 0), v70 = arm64g_calculate_condition((v69 & 1 ? 3 : 0) | 16, (v69 & 1 ? (char)v50[16] : 0), (v69 & 1 ? 100 : 0), 0), !(v70 & 1))))
            {
                v0 = v0 & 0xfffffffffffffff7 | (v1 ? 8 : 0);
                goto LABEL_9736e0;
            }
        }
        else
        {
LABEL_9736e0:
            if (!v34 || v47 == 9)
            {
                if (!v50 || v51 == 14)
                {
                    if (v34 && !(v71 = *(long long *)v34, v72 = arm64g_calculate_condition((v71 == 8245933083814097524 ? 3 : 0), (v71 == 8245933083814097524 ? *(char *)(v34 + 8) : 0), (v71 == 8245933083814097524 ? 116 : 0), 0), v72 & 1))
                    {
                        if (!v50 || v51 == 11)
                            goto LABEL_97379c;
                        goto LABEL_97381c;
                    }
                    else if (!v50 || (v73 = *(long long *)v50, v74 = arm64g_calculate_condition((v73 == 7310579615589884272 ? 4 : 0) | 16, (v73 == 7310579615589884272 ? (long long)v50[6] : 0), (v73 == 7310579615589884272 ? 8387236734843381108 : 0), 0), !(v74 & 1)))
                    {
                        v0 = v0 & 0xffffffffffffffef | (v1 ? 16 : 0);
                    }
                }
                if (!v50 || v51 == 11)
                {
                    if (!v34)
                        goto LABEL_9737c4;
LABEL_97379c:
                    v75 = *(long long *)v34;
                    v76 = arm64g_calculate_condition((v75 == 8245933083814097524 ? 3 : 0) | 16, (v75 == 8245933083814097524 ? *(char *)(v34 + 8) : 0), (v75 == 8245933083814097524 ? 116 : 0), 0);
                    if (!(v76 & 1))
                    {
LABEL_9737c4:
                        if (!v50 || (v77 = *(long long *)v50, v78 = arm64g_calculate_condition((v77 == 8313491416091418992 ? 4 : 0) | 16, (v77 == 8313491416091418992 ? (long long)v50[3] : 0), (v77 == 8313491416091418992 ? 8389754702034920811 : 0), 0), !(v78 & 1)))
                            v0 = v0 & 0xffffffffffffffdf | (v1 ? 32 : 0);
                    }
                }
LABEL_97381c:
                if ((!v50 || v51 == 15) && (!v34 || (v79 = *(long long *)v34, v80 = arm64g_calculate_condition((v79 == 8245933083814097524 ? 3 : 0) | 16, (v79 == 8245933083814097524 ? *(char *)(v34 + 8) : 0), (v79 == 8245933083814097524 ? 116 : 0), 0), !(v80 & 1))) && (!v50 || (v81 = *(long long *)v50, v82 = arm64g_calculate_condition((v81 == 8241433822053491056 ? 4 : 0) | 16, (v81 == 8241433822053491056 ? (long long)v50[7] : 0), (v81 == 8241433822053491056 ? 7234318571485226354 : 0), 0), !(v82 & 1))))
                {
                    v0 = v0 & 0xffffffffffffffbf | (v1 ? 64 : 0);
                    goto LABEL_9738ac;
                }
            }
            else
            {
LABEL_9738ac:
                if ((!v34 || v47 == 8) && (!v50 || v51 == 11) && (!v34 || *(long long *)v34 == 8751168585283626354) && (!v50 || (v83 = *(long long *)v50, v84 = arm64g_calculate_condition((v83 == 7809088257825923440 ? 4 : 0) | 16, (v83 == 7809088257825923440 ? (long long)v50[3] : 0), (v83 == 7809088257825923440 ? 8391173041969980779 : 0), 0), !(v84 & 1))))
                    v0 = v0 & 0xffffffffffffff7f | (v1 ? 128 : 0);
            }
        }
    }
    return 0;
}
