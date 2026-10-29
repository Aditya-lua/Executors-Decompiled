/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x972ad8..0x972dd4 (764 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


void sub_972ad8(void* a0, void* a1, unsigned long len, unsigned int a3)
{
    unsigned long long v20;  // x28
    unsigned long long v21;  // x27
    unsigned long long v30;  // x30
    void* iter;  // x20
    unsigned int v32;  // w8
    void* v33;  // x8
    unsigned long long v34;  // 4121
    unsigned int v35;  // w10
    unsigned long long v36;  // 4117
    void* v37;  // x9
    unsigned long long v38;  // 4121
    unsigned int v39;  // w10
    unsigned long long v22;  // x26
    unsigned int v40;  // w11
    unsigned long long v41;  // 4117
    unsigned long long v42;  // 4117
    void* v43;  // x10
    unsigned long long v44;  // 4121
    unsigned int v45;  // w11
    unsigned long v46;  // x21
    unsigned int v47;  // w8
    char v48;  // x9
    unsigned int v49;  // w8
    unsigned long long v23;  // x25
    char v50;  // x9
    unsigned long long v24;  // x24
    unsigned long long v25;  // x23
    unsigned long long v26;  // x22
    unsigned long long v27;  // x21
    unsigned long long v28;  // x20
    unsigned long long v29;  // x19
    uint128_t v0;  // [bp-0x80]
    unsigned int v1;  // [bp-0x68], Other Possible Types: unsigned short
    char v2;  // [bp-0x66]
    char v3;  // [bp-0x65]
    char v4;  // [bp-0x64]
    char v5;  // [bp-0x63]
    char v6;  // [bp-0x62]
    unsigned long long v7;  // [bp-0x60]
    unsigned long long v8;  // [bp-0x58]
    unsigned long long v9;  // [bp-0x50]
    unsigned long long v10;  // [bp-0x48]
    unsigned long long v11;  // [bp-0x40]
    unsigned long long v12;  // [bp-0x38]
    unsigned long long v13;  // [bp-0x30]
    unsigned long long v14;  // [bp-0x28]
    unsigned long long v15;  // [bp-0x20]
    unsigned long long v16;  // [bp-0x18]
    char *v17;  // [bp-0x10]
    unsigned long long v18;  // [bp-0x8]
    char v19;  // [bp+0x0]

    if ((char)a0[4])
        return;
    v7 = v20;
    v8 = v21;
    v9 = v22;
    v10 = v23;
    v11 = v24;
    v12 = v25;
    v13 = v26;
    v14 = v27;
    v15 = v28;
    v16 = v29;
    v17 = &v19;
    v18 = v30;
    iter = a1;
    sub_9721c8();
    if (a3)
        len = _strlen(iter);
    if (len)
    {
        strncpy(&v0, "\\u00", 16);
        do
        {
            v32 = *(char *)iter;
            if ((int)v32 <= 11)
            {
                if (v32 == 8)
                    goto LABEL_972d78;
                if (v32 != 9)
                {
                    if (v32 == 10)
                        goto LABEL_972d78;
                }
                else
                {
                    goto LABEL_972d78;
                }
            }
            else if (33 >= (int)v32)
            {
                if (v32 == 12)
                {
                    goto LABEL_972d78;
                }
                else if (v32 == 13)
                {
                    goto LABEL_972d78;
                }
            }
            else
            {
                if (v32 == 0x22)
                {
                    goto LABEL_972d78;
                }
                else if (v32 == 92)
                {
                    goto LABEL_972d78;
                }
            }
            if (v32 < 194)
            {
                if ((char)v32 - 127 > 160)
                {
                    sub_9721c8(a0, (char)v32);
                    v46 = len;
                    continue;
                }
                goto LABEL_972d3c;
            }
            if (len != 1 && 223 >= v32)
            {
                v33 = iter;
                v34 = arm64g_calculate_condition(193, (char)v33[1], 65, 0);
                if (!(v34 & 1))
                {
                    v1 = *(short *)iter;
                    v2 = 0;
                    iter = v33 + 1;
                    len -= 1;
                    goto LABEL_972d78;
                }
                goto LABEL_972d3c;
            }
            if (v32 < 224)
                goto LABEL_972d3c;
            if (len >= 3 && 239 >= v32)
            {
                v35 = (char)iter[1];
                v36 = arm64g_calculate_condition(193, v35, 65, 0);
                if (!(v36 & 1) && !(v37 = iter, v38 = arm64g_calculate_condition(193, (char)v37[2], 65, 0), v38 & 1 || (v39 = v35 & 0xff, v32 == 224 && (v35 & 0xff) < 160 || v32 == 237 && 159 < (v35 & 0xff))))
                {
                    v2 = (char)iter[2];
                    v1 = *(short *)iter;
                    v3 = 0;
                    len -= 2;
                    iter = v37 + 2;
                    goto LABEL_972d78;
                }
                goto LABEL_972d3c;
            }
            else if (v32 < 240 || len < 4 || 244 < v32 || (v40 = (char)iter[1], v41 = arm64g_calculate_condition(193, v40, 65, 0), v41 & 1 || (v42 = arm64g_calculate_condition(193, (char)iter[2], 65, 0), v42 & 1 || (v43 = iter, v44 = arm64g_calculate_condition(193, (char)v43[3], 65, 0), v44 & 1 || (v45 = v40 & 0xff, v32 == 240 && (v40 & 0xff) < 144 || v32 == 244 && (v40 & 0xff) > 143)))))
            {
LABEL_972d3c:
                v1 = *(unsigned int *)&v0;
                v47 = *(char *)iter;
                if (159 < v47)
                    v48 = 87;
                else
                    v48 = 48;
                v4 = v48 + (char)(v47 >> 4);
                v49 = *(char *)iter & 15;
                if (9 < v49)
                    v50 = 87;
                else
                    v50 = 48;
                v5 = v50 + (char)v49;
                v6 = 0;
                goto LABEL_972d78;
            }
            else
            {
                v1 = *(int *)iter;
                v4 = 0;
                iter = v43 + 3;
                len -= 3;
LABEL_972d78:
                sub_972574(a0);
                v46 = len;
            }
        } while ((iter += 1, len = v46 - 1, v46 != 1));
    }
    sub_9721c8();
    return;
}
