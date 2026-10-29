/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x978734..0x978b1c (1000 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_978734_0 {
    char padding_0[40];
    long long field_28;
    char padding_30[32];
    unsigned long long field_50;
    char padding_58[184];
    char field_110;
    char padding_111[383];
    char field_290;
    char padding_291[95];
    char field_2f0;
    char padding_2f1[391];
    char field_478;
    char field_479;
    char padding_47a[19];
    char field_48d;
    char padding_48e[20];
    char field_4a2;
    char padding_4a3[41];
    char field_4cc;
    char field_4cd;
    char padding_4ce[58];
    long long field_508;
    long long field_510;
    long long field_518;
    long long field_520;
    char padding_528[64];
    long long field_568;
    char padding_570[8];
    long long field_578;
    char padding_580[160];
    unsigned long long field_620;
    char field_621;
    char padding_622[1];
    char field_623;
} st_978734_0;

extern long long g_c7c2eb;

char sub_978734(st_978734_0 *a0)
{
    char *v4;  // x23
    char *v5;  // x20
    char *v6;  // x21
    char idx;  // x0
    unsigned long v8;  // x1
    long long v9;  // x20
    char v13;  // x19
    char v0;  // [bp-0x80]
    char v1;  // [bp-0x78]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v0 = 0;
    v4 = &a0->field_48d;
    v5 = &a0->field_478;
    if (!a0->field_48d)
        v6 = v5;
    else
        v6 = v4;
    if (!a0->field_50 && !(*((char *)&a0->field_620 + 1) & 1))
    {
        idx = sub_9ebce0();
        if (idx)
        {
            idx = idx;
            if (sub_c689b0(&v1, idx))
            {
                if (!sub_98eac8(&v1, 12, 0, 0))
                {
LABEL_9789dc:
                    sub_a6ed4c(&v1);
                }
                else if (!((char)(*((char *)&a0->field_620 + 3)) >> 1 & 1))
                {
                    goto LABEL_9789dc;
                }
                else
                {
                    if (!sub_98ebe4(&v1, 0, v6) || !sub_98ebe4(&v1, 15, &a0->field_4cc) || *v4 && !sub_98ebe4(&v1, 16, v5) || !sub_98eb64(&v1, 1, a0->field_568) || !sub_98eb64(&v1, 3, 1200) || !sub_98eb64(&v1, 14, 2) || a0->field_520 != 25 && !sub_98eb64(&v1, 11) || !sub_98eb64(&v1, 4, sub_954340(&a0->field_110)) || !sub_98eb64(&v1, 5, a0->field_508) || !sub_98eb64(&v1, 6, a0->field_510) || !sub_98eb64(&v1, 7, a0->field_518) || !sub_98eb64(&v1, 8, sub_954340(&a0->field_290)) || !sub_98eb64(&v1, 9, sub_954340(&a0->field_2f0)) || !sub_a6eaf8(&v1))
                        goto LABEL_9789dc;
                    if (sub_c68eb8(&v1, &v0) && !(v8 = *(long long *)(idx + 8), a0->field_50 = v8, *(unsigned long long *)(idx + 8) = 0, !sub_98a6cc(a0->field_28, v8, v0)))
                    {
                        v9 = sub_978c28(a0);
                        if (sub_c61590(v9, 4, "transport", "parameters_set", "transport:parameters_set"))
                        {
                            sub_973a98(v9, "owner", "local");
                            sub_973b44(v9, "disable_active_migration", 1);
                            if (!((char)(*((char *)&a0->field_620 + 3)) >> 1 & 1))
                            {
                                sub_973a98(v9, "initial_source_connection_id", &g_c7c2eb);
                            }
                            else
                            {
                                sub_973b78(v9, "original_destination_connection_id", &a0->field_479, a0->field_478);
                                sub_973b78(v9, "initial_source_connection_id", &a0->field_4cd, a0->field_4cc);
                            }
                            sub_973b10(v9, "max_idle_timeout", a0->field_578);
                            sub_973b10(v9, "max_udp_payload_size", 1200);
                            sub_973b10(v9, "active_connection_id_limit", 2);
                            sub_973b10(v9, "max_ack_delay", a0->field_520);
                            sub_973b10(v9, "initial_max_data", sub_954340(&a0->field_110));
                            sub_973b10(v9, "initial_max_stream_data_bidi_local", a0->field_508);
                            sub_973b10(v9, "initial_max_stream_data_bidi_remote", a0->field_510);
                            sub_973b10(v9, "initial_max_stream_data_uni", a0->field_518);
                            sub_973b10(v9, "initial_max_streams_bidi", sub_954340(&a0->field_290));
                            sub_973b10(v9, "initial_max_streams_uni", sub_954340(&a0->field_2f0));
                            sub_c6186c(v9);
                        }
                        a0->field_620 = a0->field_620 | 0x100;
                        v13 = 1;
                        goto LABEL_9789e8;
                    }
                }
            }
            v13 = 0;
LABEL_9789e8:
        }
        else
        {
            v13 = 0;
        }
    }
    else
    {
        v13 = 0;
        idx = 0;
    }
    sub_9ebcf4(idx);
    return v13;
}
