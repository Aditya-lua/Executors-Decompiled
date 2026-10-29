/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa3d178..0xa3d2c4 (332 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a3d178_0 {
    char field_0;
    char field_1;
} st_a3d178_0;

typedef struct st_a3d178_2 {
    char padding_0[32];
    long long field_20;
    char padding_28[8];
    struct st_a3d178_1 *field_30;
} st_a3d178_2;

typedef struct st_a3d178_1 {
    struct st_a3d178_0 *field_0;
    unsigned int field_8;
} st_a3d178_1;


long long sub_a3d178(long long a0, long long a1, st_a3d178_2 *a2)
{
    long long v2;  // x0
    long long v3;  // x23
    long long v12;  // x20
    long long v4;  // x0
    long long v5;  // x19
    long long v6;  // x0
    long long v7;  // x0
    long long v8;  // x23
    long long v9;  // x0
    long long v10;  // x24
    unsigned int v11;  // w8
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a59bc4(a2->field_20);
    a2->field_20 = 0;
    if (v2)
    {
        v3 = v2;
        v4 = sub_9dddcc(sub_a19700());
        if (v4)
        {
            v5 = v4;
            v6 = sub_975ff4(v3);
            v7 = sub_9ffdd0(v3);
            if (a2->field_30->field_8 == 2)
            {
                v8 = sub_9de208(v5);
                v9 = sub_9de208(v5);
                if (v9)
                {
                    v10 = v9;
                    if (sub_a1b3cc(v7, v6, v8, v10, v5) && a2->field_30->field_0->field_0 == 113)
                    {
                        v11 = a2->field_30->field_0->field_1;
                        if (v11 == 120)
                        {
                            a2->field_20 = v8;
                            v12 = sub_a3aef4(a0, a1, a2);
                            sub_9dded4(v5);
                            return v12;
                        }
                        else if (v11 == 121)
                        {
                            a2->field_20 = v10;
                            v12 = sub_a3aef4(a0, a1, a2);
                            sub_9dded4(v5);
                            return v12;
                        }
                    }
                }
            }
            sub_9dded4(v5);
            return 0;
        }
    }
    else
    {
        sub_a368c8();
        sub_a369bc("crypto/evp/ctrl_params_translate.c", 1674, "get_payload_public_key_ec");
        sub_a36abc(6, 224, 0);
    }
    return 0;
}
