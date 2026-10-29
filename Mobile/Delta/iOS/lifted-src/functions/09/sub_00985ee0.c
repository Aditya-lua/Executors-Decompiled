/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x985ee0..0x9860e8 (520 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_985ee0_0 {
    long long field_0;
    long long field_8;
    unsigned long long field_10;
    unsigned long long field_18;
} st_985ee0_0;


unsigned long long sub_985ee0(st_985ee0_0 *a0, unsigned long long a1, unsigned long long a2)
{
    unsigned long long v18;  // x28
    unsigned long long v19;  // x27
    unsigned long long v28;  // x30
    unsigned long long v29;  // x0
    unsigned long long v30;  // x21
    unsigned long v31;  // x11
    unsigned long v32;  // x22
    unsigned long long v33;  // x12
    unsigned long long v34;  // x1
    unsigned long long v35;  // x27
    unsigned long v36;  // x28
    unsigned long long v37;  // x9
    unsigned long long v20;  // x26
    unsigned long long v38;  // x9
    unsigned long long v39;  // x10
    unsigned long long i;  // x9
    unsigned long long v41;  // x10
    unsigned long long v42;  // x24
    unsigned long long v43;  // x9
    unsigned long long v44;  // x9
    unsigned long long v45;  // x9
    unsigned long long v46;  // 4127
    unsigned long long v21;  // x25
    unsigned long long v22;  // x24
    unsigned long long v23;  // x23
    unsigned long long v24;  // x22
    unsigned long long v25;  // x21
    unsigned long long v26;  // x20
    unsigned long long v27;  // x19
    long long v0;  // [bp-0x88]
    unsigned long v1;  // [bp-0x80]
    unsigned long long v2;  // [bp-0x78]
    unsigned long v3;  // [bp-0x70]
    unsigned long long v4;  // [bp-0x68]
    unsigned long long v5;  // [bp-0x60]
    unsigned long long v6;  // [bp-0x58]
    unsigned long long v7;  // [bp-0x50]
    unsigned long long v8;  // [bp-0x48]
    unsigned long long v9;  // [bp-0x40]
    unsigned long long v10;  // [bp-0x38]
    unsigned long long v11;  // [bp-0x30]
    unsigned long long v12;  // [bp-0x28]
    unsigned long long v13;  // [bp-0x20]
    unsigned long long v14;  // [bp-0x18]
    char *v15;  // [bp-0x10]
    unsigned long long v16;  // [bp-0x8]
    char v17;  // [bp+0x0]

    if (a0->field_8 == a1)
        return 1;
    v5 = v18;
    v6 = v19;
    v7 = v20;
    v8 = v21;
    v9 = v22;
    v10 = v23;
    v11 = v24;
    v12 = v25;
    v13 = v26;
    v14 = v27;
    v15 = &v17;
    v16 = v28;
    if (a0->field_10 - a0->field_18 > a1)
        return 0;
    v29 = sub_a6bf4c(a1, "include/internal/ring_buf.h", 244);
    if (!v29)
        return v29;
    v30 = v29;
    v31 = a0->field_10;
    v32 = a0->field_18;
    if (v32 <= v31)
    {
        v33 = 0;
        v34 = a0->field_8;
        v0 = a0->field_0;
        v1 = v31;
        v35 = v32 + a1;
        v2 = a0->field_8;
        v3 = v32;
        v36 = v32;
        do
        {
            if (v34)
            {
                v37 = v33 + v32;
                v38 = v31 - v37;
                v39 = v34 - (v37 - v34 * v37 / v34);
                if (v38 >= v39)
                    v38 = v39;
                if (!v38)
                    goto LABEL_986070;
            }
            else
            {
                v36 = v32;
LABEL_986070:
                if (a2)
                    sub_a6c4e8(v0);
                else
                    sub_a6c2e4(v0, "include/internal/ring_buf.h", 60);
                a0->field_0 = v30;
                a0->field_8 = a1;
                a0->field_10 = v36;
                a0->field_18 = v32;
                return 1;
            }
            v4 = v33;
            i = v35 - v36;
            if (v38 < i)
                i = v38;
            v41 = 0x4000000000000000 - v36;
            v42 = 0;
            if (i >= v41)
                i = v41;
            if (i)
            {
                do
                {
                    v43 = a1 - (v36 - a1 * v36 / a1);
                    if (i < v43)
                        v43 = i;
                    _memcpy();
                    v36 += v43;
                    i -= v43;
                    v42 += v43;
                    v44 = v35 - v36;
                    if (i >= v44)
                        i = v44;
                    v45 = 0x4000000000000000 - v36;
                    if (i >= v45)
                        i = v45;
                } while (i);
            }
            if (v42 != v38)
            {
                sub_a6c2e4(v30, "include/internal/ring_buf.h", 262);
                return 0;
            }
            v32 = v3;
            v33 = v38 + v4;
            v31 = v1;
            v46 = arm64g_calculate_condition(0x22, v32, v33, 0);
        } while (!(v46 & 1) && (v34 = v2, v32 + v33 <= v31));
    }
    sub_a6c2e4(v30, "include/internal/ring_buf.h", 254);
    return 0;
}
