/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa3cfc4..0xa3d178 (436 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a3cfc4_0 {
    char padding_0[8];
    long long field_8;
} st_a3cfc4_0;

typedef struct st_a3cfc4_1 {
    char padding_0[32];
    long long field_20;
    unsigned long long field_28;
    struct st_a3cfc4_0 *field_30;
} st_a3cfc4_1;


long long sub_a3cfc4(long long a0, long long a1, st_a3cfc4_1 *a2)
{
    long long v3;  // x22
    unsigned int v4;  // w0
    unsigned long long v6;  // x0
    long long v7;  // x24
    long long v8;  // x22
    long long v9;  // x0
    long long v10;  // x0
    unsigned long long v11;  // x0
    long long v12;  // x0
    long long v0;  // [bp-0x48]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v3 = a2->field_20;
    v0 = 0;
    a2->field_20 = 0;
    v4 = sub_a5b018(v3);
    if (407 >= (int)v4)
    {
        switch (v4)
        {
        case 28:
            goto LABEL_a3d044;
        case 116:
            if ((int)a2->field_30->field_8 == 2)
            {
                a2->field_20 = sub_a0212c(sub_a5ace4(v3));
                v12 = sub_a3aef4(a0, a1, a2);
                sub_a6c2e4(v0, "crypto/evp/ctrl_params_translate.c", 1653);
                return v12;
            }
            break;
        default:
            sub_a368c8();
            goto LABEL_a3d084;
        }
    }
    else
    {
        switch (v4)
        {
        case 408:
            if ((int)a2->field_30->field_8 == 5)
            {
                v7 = sub_a59bc4(v3);
                v8 = sub_9dddcc(sub_a19700(v7));
                v9 = sub_9ffdd0(v7);
                v10 = sub_975ff4(v7);
                if (v8)
                {
                    v11 = sub_a1dbcc(v9, v10, 2, &v0, v8);
                    a2->field_20 = v0;
                    a2->field_28 = v11;
                    sub_9dded4(v8);
                    v12 = sub_a3aef4(a0, a1, a2);
                    sub_a6c2e4(v0, "crypto/evp/ctrl_params_translate.c", 1653);
                    return v12;
                }
            }
            break;
        case 920:
LABEL_a3d044:
            if ((int)a2->field_30->field_8 == 2)
            {
                a2->field_20 = sub_9ffde0(sub_a5af48(v3));
                v12 = sub_a3aef4(a0, a1, a2);
                sub_a6c2e4(v0, "crypto/evp/ctrl_params_translate.c", 1653);
                return v12;
            }
            else if ((int)a2->field_30->field_8 == 5)
            {
                v6 = sub_9ff4b4(sub_a5af48(v3), &v0, 0, 1);
                a2->field_20 = v0;
                a2->field_28 = v6;
                v12 = sub_a3aef4(a0, a1, a2);
                sub_a6c2e4(v0, "crypto/evp/ctrl_params_translate.c", 1653);
                return v12;
            }
        default:
            sub_a368c8();
LABEL_a3d084:
            sub_a369bc("crypto/evp/ctrl_params_translate.c", 1648, "get_payload_public_key");
            sub_a36abc(6, 224, 0);
            break;
        }
    }
    return 0;
}
